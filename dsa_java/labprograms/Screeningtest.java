package dsa_java.labprograms;
import java.util.*;
public class Screeningtest {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        ArrayList<ArrayList<Character>> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        int i=0;
        int ans=65;
        while(i<=n){
            for(int j=i;j<n;j++){
                if(ans>=91){
                    ans=65;
                }
                arr.get(j).add(0,(char)ans);
                ans++;
            }
            i++;
        }
        // System.out.println(arr);
        for(ArrayList<Character> sub:arr){
            for(Character v:sub){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}
// you should give n as input which determines number of rows
// eg n=3 means that the pattern will be
// *
// * *
// * * *
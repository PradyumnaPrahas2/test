package dsa_java;
import java.util.*;
public class longestpalindromic {
    public static boolean check(String sub){
        String bus=new StringBuilder(sub).reverse().toString();
        return bus.equals(sub);
    }
    public static void main(String[] args) {
        //BRUTE FORCE APPROACH
        Scanner x=new Scanner(System.in);
        String str=x.next();
        int maximum=1;
        String answer="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                try{
                String sub=str.substring(i,j+1);
                if(check(sub)==true){
                    if(sub.length()>maximum){
                        maximum=sub.length();
                        answer=sub;
                    }
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            }
        }
        System.out.println(answer);
    }
}

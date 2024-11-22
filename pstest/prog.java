package pstest;
import java.util.*;
public class prog {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=3;
        for(int i=0;i<k;i++){
            int temp=arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        usingCollections();
    }
    public static void usingCollections(){
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int k=3;
        for(int i=0;i<k;i++){
            int temp=a.getLast();
            a.removeLast();
            a.addFirst(temp);
        }
        System.out.println(a);
    }
}
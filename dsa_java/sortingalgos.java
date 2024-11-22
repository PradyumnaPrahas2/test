package dsa_java;
import java.util.*;
public class sortingalgos {
    public static void selectionsort(int [] arr){
        float s=System.currentTimeMillis();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<a){
                    k=j;
                    a=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        System.out.println("Selection sort:");
        for(int v:arr){
            System.out.print(v+" ");
        }
        System.out.println(System.currentTimeMillis()-s);
    }
    public static void insertionsort(int [] arr){
        float s=System.currentTimeMillis();
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0){
                if(arr[j]>key){
                    arr[j+1]=arr[j];

                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("\nInsertion sort:");
        for(int v:arr){
            System.out.print(v+" ");
        }
        System.out.println(System.currentTimeMillis()-s);
    }
    public static void main(String[] args) {
        int [] arr={10,2,4,3,5,9,3,18,20,7,28,8,6,28,9,10,366,1,3,49,0,23,7};
        selectionsort(arr);
        int [] arr2={10,2,4,3,5,9,3,18,20,7,28,8,6,28,9,10,366,1,3,49,0,23,7};
        insertionsort(arr2);
    }
}

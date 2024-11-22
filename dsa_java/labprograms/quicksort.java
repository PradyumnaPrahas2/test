package dsa_java.labprograms;
import java.util.*;
public class quicksort {
    public static int partition(int[] arr,int i,int j){
        int pivot=arr[i];
        int index=j;
        for(int k=j;k>i;k--){
            if(arr[k]>pivot){
                int temp=arr[k];
                arr[k]=arr[index];
                arr[index]=temp;
                // swap(arr[k],index);
                index--;
            }
        }
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
        // swap(arr[high],index);
        return index;
    }
    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int piv=partition(arr,low,high);
            quicksort(arr, low, piv-1);
            quicksort(arr, piv+1, high);
        }
    }
    public static void main(String[] args) {
        float s=System.currentTimeMillis();
        int[] arr={1,4,6,2,0};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(System.currentTimeMillis()-s);
    }
}
// 5 7 8 1    pivot =5, idx=1

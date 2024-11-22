package dsa_java.labprograms;
import java.util.*;
public class mergesort {
    public static void mergearray(int[] arr,int left,int mid,int right){
        int[] first=new int[mid-left+1];
        int[] second=new int[right-mid];
        for(int i=0;i<first.length;i++){
            first[i]=arr[left+i];
        }
        for(int j=0;j<second.length;j++){
            second[j]=arr[mid+j+1];
        }

        int i=0,j=0;
        int count=left;
        while(i<first.length & j<second.length){
            if(first[i]<second[j]){
                arr[count]=first[i];
                count++;i++;
            }
            else{
                arr[count]=second[j];count++;j++;
            }
        }
        while(i<first.length){
            arr[count]=first[i];i++;count++;
        }
        while(j<second.length){
            arr[count]=second[j];j++;count++;
        }
        System.out.println(Arrays.toString(first)+" "+Arrays.toString(second)+" "+Arrays.toString(arr));
    }
    public static void MergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            MergeSort(arr,left,mid);
            MergeSort(arr,mid+1,right);
            mergearray(arr,left,mid,right);
        }
    }
    public static void main(String[] args){
        int[] arr={6,4,2,3,1};
        MergeSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}

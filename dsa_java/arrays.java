package dsa_java;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class arrays {
    public static void main(String[] args){
        Random random=new Random();
        Scanner x=new Scanner(System.in);
        String l=x.nextLine();
        System.out.println(l+"\nEnter number of elements: ");
        Integer n=x.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=random.nextInt(100-0+1)+0;
        }
        System.out.println("Actual array");
        for(int val:arr){
            System.out.print(val+" ");
        }
        Arrays.sort(arr);//sorting the array
        //parallelSort for parallel sorting technique
        //sort for normal sort
        //use Collections.reverseOrder() as a parameter for reverse order of the array
        System.out.println("\nSorted array is "+Arrays.toString(arr));//printing the array,use deeptoString for 2D arrays
        System.out.println("Enter the element to search:");
        int s=x.nextInt();
        int key=Arrays.binarySearch(arr,s);//binary search method
        System.out.println("Element "+s+" is found at index "+key);
        System.out.println("copy of the input array is: "+Arrays.toString(Arrays.copyOf(arr,10)));//copying original array and resizing it
        //ARRAYLIST CLASS FROM JAVA UTILITY PACKAGE
        Scanner y=new Scanner(System.in);
        String k=y.nextLine();
        ArrayList<Integer> arr1=new ArrayList<>();
        String[] sentence_arr=k.split(" ");
        for(String v: sentence_arr){
            arr1.add(Integer.parseInt(v));
        }
        //Printing elements
        System.out.println(arr1);
        y.close();
        x.close();
    }
}

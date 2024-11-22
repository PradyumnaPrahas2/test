package dsa_java;
import java.util.*;
public class vectors {
    public static void main(String[] args) {
        //Vectors are collections of objects that perform operations of an array and it use arrays to do all this operations, they were introduced before arraylist
        // Vectors implement List interface
        //Vectors are much slower than ArrayList about 4x slower
        //Vectors are more reliable than ArrayLists
        // Upon performing tasks by using threads ArrayList tend to make errors but Vectors dont so they are more reliable
        // Verdict is ArrayList can be preffered over Vectors!
        long s=System.currentTimeMillis();
        List<Integer> v1=new Vector<>();
        for(int i=0;i<200000;i++){
            v1.add(i);
        }
        // System.out.println("Vector is "+v1);
        System.out.println("It took "+(System.currentTimeMillis()-s)+" second(s) to add all elements to the vector");
        s=System.currentTimeMillis();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<200000;i++){
            arr.add(i);
        }
        // System.out.println("ArrayList is "+arr);
        System.out.println("It took "+(System.currentTimeMillis()-s)+" second(s) to add all elements to the ArrayList");
    }
}

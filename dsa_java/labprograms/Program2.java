package dsa_java.labprograms;
import java.util.*;
public class Program2 {
    public static void main(String args[]){
        HashSet<Integer> set1=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        HashSet<Integer> set2=new HashSet<>();
        set2=(HashSet)set1.clone();// CONCEPT OF SHALLOW COPYING
        System.out.println(set2);
    }
}

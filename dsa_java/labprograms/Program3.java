package dsa_java.labprograms;
import java.util.*;
public class Program3 {
    public static void main(String args[]){
        HashSet<Integer> set1=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        HashSet<Integer> union=new HashSet<>(set1);
        union.removeAll(set2);
        System.out.println(union);
        HashSet<Integer>intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
    }
}

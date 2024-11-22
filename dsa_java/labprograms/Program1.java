package dsa_java.labprograms;
import java.util.*;
public class Program1 {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            Integer c=it.next();
            System.out.println(c);
        }
    }
}

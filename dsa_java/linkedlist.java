package dsa_java;
import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        ll.add(0, 0);
        System.out.println(ll);
    }
}

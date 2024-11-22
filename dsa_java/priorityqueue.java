package dsa_java;
import java.util.*;
public class priorityqueue {
    public static void main(String[] args){
        //Initializing
       Comparator<Integer> comp=Comparator.reverseOrder();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        //adding elements
        pq.add(5);
        pq.add(2);
        pq.add(6);
        pq.add(8);
        System.out.println("Elements are: "+pq);
        //clear() ->clears the priorityqueue
        //contains()->boolean
        Iterator<Integer>i=pq.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

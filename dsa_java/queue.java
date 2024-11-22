package dsa_java;
import java.util.*;
public class queue {
    public static void main(String[] args){
        //methods of queue and linkedlist
        //add->adds elements into the queue
        //offer->inserting specific element
        //remove->removes front element
        //poll->retrives and returns front element
        //element->retreieves front but doesnt remove
        //peek->same as element but throws an exception if queue is empty
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Elements of the queue are(inorder) "+q);
        q.remove();
        System.out.println("Elements of the queue are(inorder) "+q);
        System.out.println(q.poll());
    }
}

package dsa_java;
import java.util.*;
public class stack {
    public static void main(String[] args){
        Stack<Integer> x=new Stack<Integer>();
        x.push(10);
        x.push(10);
        x.push(20);
        while(!x.empty()){
            // System.out.println(x.peek());
            x.pop();
        }
        List<Integer> l=new Stack<>();
        l.add(10);
        l.add(20);
        System.out.println(l.get(0));
        System.out.println(l);
        //ALL THE METHODS OF STACK ARE
        //push
        //pop
        //search
        //empty
        //peek()
        //
    }
}

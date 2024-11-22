package dsa_java.labprograms;
import java.util.*;

import javax.management.Query;
public class program5 {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        List<Integer> l=new LinkedList<>();
        
        System.out.println("Keep entering your inputs (non-int) to break");
        while(true){
            try{
                int input=x.nextInt();
                l.add(0,input);
            }
            catch(InputMismatchException e){
                System.out.println(e);
                break;
            }
        }
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.shuffle(l);
        System.err.println(l);
    }
}

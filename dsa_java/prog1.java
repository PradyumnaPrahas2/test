package dsa_java;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

import javax.print.attribute.IntegerSyntax;
public class prog1 {
    public static void main(String[] args) {
        //1
        ArrayList<String> arr=new ArrayList<>();
        arr.add("first");
        arr.add("second");
        arr.add("third");
        arr.add("fifth");
        System.out.println("1.ARRAY IS: "+arr );
        //2
        arr.add(0, "fourth");
        System.out.println("2.Inserted into first\n the arr is: "+arr);
        //3
        arr.remove(4);
        System.out.println("3.Removed fifth element from array\nthe arr is: "+arr);
        //4
        System.out.println("4.The original array is: "+arr);
        Collections.sort(arr);
        System.out.println("The sorted array is: "+arr);
        //5
        Collections.shuffle(arr);
        System.out.println("5.After shuffle the array is: "+arr);
        //6
        System.out.println("6.Original size is: ");
        System.out.println(arr.size());
        arr.ensureCapacity(10);
        System.out.println("New size "+arr.size());
        //7
        Collections.reverse(arr);
        System.out.println("7.Reverse order is: "+Arrays.asList(arr));
        //8
        System.out.println("8. "+arr.equals(arr));
        //9
        Collections.swap(arr, 1, 0);
        System.out.println("9.After swapping the array is: "+arr);
        //10
        arr.addAll(arr);
        System.out.println("10.Array after adding :"+arr);
        // arr.clear();
        // System.out.println("After clearing "+arr);
        //12
        System.out.println("12.element at a specific index:- "+arr.get(3));
        //13
        arr.set(0, "hello");
        System.out.println("13. "+arr);
        //14
        System.out.println("14");
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equalsIgnoreCase("hello")){System.out.println("Element found at "+i);}
        }
        //15
        ArrayList<String> arr2=new ArrayList<>();
        for(int i=0;i<8;i++){arr2.add("kk");}
        Collections.copy(arr2,arr);
        System.out.println("15.Copied arr1 to arr2: "+arr2);
        //11
        arr.clear();
        System.out.println("11.After clearing "+arr);
        //16
        // arr2=(ArrayList)arr.subList(0,2);
        // System.out.println("16. "+arr2);
        // //17==//15
        // //18
        // System.out.println("18. "+arr.isEmpty());
        // //19
        // arr.trimToSize();
        // System.out.println("19.Trimmed "+arr.size());
        // //20
        // System.out.println("20 "+arr);
        // //21
        // System.out.println("21 "+Collections.max(arr));
        // //22
        // System.out.println("22. "+Collections.min(arr));
        // //23
        // Scanner x=new Scanner(System.in);
        // int h;
        // ArrayList<Integer> m=new ArrayList<>();
        // h=x.nextInt();
        // m.add(h);
        // h=x.nextInt();
        // m.add(h);
        // System.out.println("23 "+m);
        // //24
        // System.out.println("Enter element to search");
        // h=x.nextInt();
        // System.out.println("24 "+m.contains(h));
    }
}

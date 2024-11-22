package dsa_java;
import java.util.*;
import java.io.*;
public class practice {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Prahas");
        arr.add("KMIT");
        arr.add("1J");
        arr.add("JAVA");
        arr.add(0,"First");
        arr.remove(4);
        // Collections.sort(arr);
        // Collections.shuffle(arr);
        Collections.swap(arr, 3, 0);
        Collections.reverse(arr);
        // arr.addAll(arr);
        // arr.clear();
        System.out.println(Collections.binarySearch(arr, "3"));
        System.out.println(arr);
        System.out.println(arr.subList(0,1));
        System.out.println(arr.clone());
        System.out.println(arr.isEmpty());
        arr.trimToSize();
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
        arr.add("Prahas");
        System.out.println(arr);
        HashSet<String> hashmap=new HashSet<>(arr);
        System.out.println(hashmap);
        ArrayList<String> arrd=new ArrayList<>(hashmap);
        arrd.set(0,"null");
        System.out.println(arrd.indexOf("null"));
        System.out.println();
    }
}

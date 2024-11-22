package dsa_java;
import java.util.*;
public class completemaps {
    public static void main(String[] args) {
        Set<String> mySet=new HashSet<>() ;
        mySet.add("Prahas");
        mySet.add("Armaan");
        mySet.add("Varshith");
        mySet.add("Aditya");
        mySet.add("Prahas");
        // System.out.println(mySet);
        Iterator<String> it=mySet.iterator();
        while(it.hasNext()){
            String c=it.next();
            if(c!="Prahas"){
                System.out.println(c);
            }
        }
        //Set has order
        // HashSet is a class that implements the interface set since interfaces are abstract we cannot directly invoke methods of set
        // To not alter the order of the entrants we use a LinkedHashSet<>() instead of a HashSet<>() but it is slower than hashset but faster than a treeset
        // TreeSet orders the set alphabetically / numerically but TreeSet is extremely slower than HashSet
        HashMap<String,Integer> myMap=new HashMap<>();
        myMap.put("Prahas",97);
        myMap.put("Armaan",94);
        myMap.put("Aditya",90);
        myMap.put("Varshith",87);
        System.out.println(myMap);
        // A HashMap orders elements by keys
        TreeMap<String,Integer> treeMap= new TreeMap<>(myMap);
        System.out.println(treeMap);
    }
}

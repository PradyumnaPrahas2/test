package dsa_java.labprograms;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class comparators {
    public static void main(String args[]) throws FileNotFoundException,IOException{
        FileReader f=new FileReader("C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\multi_threading\\filehandling2.csv");
        BufferedReader b=new BufferedReader(f);
        String s=b.readLine();
        Comparator<ArrayList<String>> comp=new Comparator<ArrayList<String>>(){
            @Override 
            public int compare(ArrayList<String> a1,ArrayList<String> a2){
                return -a1.get(0).compareTo(a2.get(0));
            }
        };
        ArrayList<ArrayList<String>> arr=new ArrayList<>();
        while(s!=null){
            // System.out.println(s);
            String[] c=s.split(",");
            ArrayList<String> newarr=new ArrayList<>();
            for(String v:c){
                newarr.add(v);
            }
            arr.add(newarr);
            s=b.readLine();
        }
        Collections.sort(arr,comp);
        System.out.println(arr);    
    }
}

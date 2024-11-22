package multi_threading;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
// import com.opencsv.CSVWriter;
import java.util.Scanner;
public class writeandread {
    public static void main(String[] args) throws InterruptedException,FileNotFoundException{
        ArrayList<String>data=new ArrayList<>();
             data.add("1,Aditya,95");
             data.add("2,Armaan,96");
             data.add("3,Varshith,90");
             data.add("4,Prahas,94");
             data.add("5,Anand,90");
             data.add("6,Sagar,98");
        MultiThreading1 t1=new MultiThreading1(1,"C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\multi_threading\\filehandling2.csv");
        MultiThreading2 t2=new MultiThreading2(2,"C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\multi_threading\\filehandling2.csv");
        MultiThreading3 t3=new MultiThreading3(3,"C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\multi_threading\\filehandling2.csv",data);
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();

    }
}
class MultiThreading1 extends Thread {
    private int threadnumber;
    private String filename;
    MultiThreading1(int number,String fname) throws FileNotFoundException{
        this.threadnumber=number;
        this.filename=fname;
    }
    @Override
    public void run(){
        try{
            System.out.println("The duty of the current thread is to sort all the elements present in the file by roll number");
            ArrayList<ArrayList<String>> myArr=new ArrayList<>();
            FileReader f=new FileReader(filename);
            BufferedReader f2=new BufferedReader(f);
            String s=f2.readLine();
            String [] contents;
            while(s!=null){
                contents=s.split(",");
                ArrayList<String> dup=new ArrayList<>();
                for(String x:contents){
                    dup.add(x);
                    System.out.print(x+" ");
                }
                myArr.add(dup);
                System.out.println();
                s=f2.readLine();
            }
            final int col = 2;
            Comparator<ArrayList<String>> myComparator = new Comparator<ArrayList<String>>() {
                @Override
                public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                    return o1.get(col).compareTo(o2.get(col));
                }
            };
            Collections.sort(myArr, myComparator);
            System.out.println(myArr);
            ArrayList<String> d=new ArrayList<>();
            for(ArrayList<String> j:myArr){
                String ans="";
                for(String x:j){
                    ans+=x+",";
                }
                d.add(ans.substring(0,ans.length()-1));
            }
            MultiThreading3 t4=new MultiThreading3(4,"C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\multi_threading\\filehandling.csv" , d);
            t4.start();
            t4.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
class MultiThreading2 extends Thread {
    private int threadnumber;
    private String filename;
    MultiThreading2(int number,String fname) throws FileNotFoundException{
        this.threadnumber=number;
        this.filename=fname;
    }
    @Override
    public void run(){
        try{
            System.out.println("The task of this thread is to read data from the files");
        FileReader f=new FileReader(filename);
            BufferedReader f2=new BufferedReader(f);
            String s=f2.readLine();
            String [] contents;
            while(s!=null){
                contents=s.split(",");
                for(String x:contents){
                    System.out.print(x+" ");
                }
                System.out.println();
                s=f2.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
class MultiThreading3 extends Thread {
    private int threadnumber;
    private ArrayList<String> data;
    private String filename;
    MultiThreading3(int number,String fname,ArrayList<String>d) throws FileNotFoundException{
        this.threadnumber=number;
        this.filename=fname;
        this.data=d;
    }
    @Override
    public void run(){
        // File file = new File("C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\multi_threading\\filehandling.csv");

        try {
            FileWriter f=new FileWriter(filename);
             for (String h : data) {
                f.write(h + System.lineSeparator());
            }
            f.flush();
            System.out.println("CSV file written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

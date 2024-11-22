import  java.io.*;
import java.util.Scanner;
import java.io.File;
public class files {
    public static void main(String[] args) throws IOException {
        // File f1=new File("C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\example.txt");
        // FileInputStream f2 =new FileInputStream(f1);
        File f=new File("example.txt");
        Scanner s=new Scanner(f);
        while(s.hasNextLine()){
            String g=s.nextLine();
            System.out.println(g);
        }
       System.out.println("Size of the file is : "+f.length());
       FileWriter f2=new FileWriter("hello.txt");
       f2.write("This is implementation of file writing method");
       f2.close();
       File f3=new File("hello.txt");
       Scanner s2=new Scanner(f3);
       System.out.println("Size: "+f3.length());
       while(s2.hasNextLine()){
        String d=s2.nextLine();
        System.out.println(d);
       }
       f2.close();
       if(f3.delete()){
        System.out.println(f3.getName()+" file has been deleted");
       }
       else{
        System.out.println("Failed to delete the file sorry!");
       }
    }
}

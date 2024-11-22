import java.io.*;
import java.util.Scanner;
public class deletefile {
    public static void main(String[] args) throws IOException{
        File f=new File("hello.txt");
        if(f.delete()){
            System.out.println("File has been deleted: "+f.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
        File f3=new File("example.txt");
        Scanner s=new Scanner(f3);
        while(s.hasNextLine()){
            String g=s.nextLine();
            String[] set=g.split(",");
            int score=Integer.parseInt(set[1]);
            if(score>20){
                System.out.println(set[0]+" has scored more than 20 runs");
            }
        }
    }
}

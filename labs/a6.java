package labs;
import java.util.*;
import java.io.*;
public class a6 {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileReader f=new FileReader("C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\labs\\datafile.txt");
        BufferedReader b=new BufferedReader(f);
        HashMap<String,String> mp=new HashMap<>();
        String data=b.readLine();
        while(data!=null){
            String[] chr=data.split(" ");
            mp.put(chr[0],chr[1]);
            mp.put(chr[1],chr[0]);
            data=b.readLine();
        }
        Scanner x=new Scanner(System.in);
        String in=x.nextLine();
        System.out.println(mp.getOrDefault(in,"Data Not Found"));
    }
}

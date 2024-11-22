package labs;
import java.io.*;
import java.util.*;
public class b6 {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileReader f=new FileReader("C:\\Users\\praha\\OneDrive\\Desktop\\JAVA_PROGRAMMING\\labs\\data.txt");
        BufferedReader b=new BufferedReader(f);
        HashMap<String,HashMap<String,Long>> data=new HashMap<>();
        TreeMap<String,Integer> answer=new TreeMap<>();
        int n=Integer.parseInt(b.readLine());
        for(int i=0;i<n;i++){
            System.out.println(data);
            String lang=b.readLine();
            // System.out.println(lang);
            String IP=b.readLine();
            // System.out.println(IP);
            long time=Long.parseLong(b.readLine());
            HashMap<String,Long> d=new HashMap<>();
            d.put(IP,time);
            if(data.containsKey(lang)){
                if(data.get(lang).containsKey(IP)){
                    if(time-data.get(lang).get(IP)<=20){
                        // System.out.println("Data Exempted -> "+lang+" "+time+" "+IP);
                    }
                    else{
                        // System.out.println("Data ACCEPTED -> "+lang+" "+time+" "+IP);

                        answer.put(lang,answer.getOrDefault(lang,0)+1);
                        HashMap<String,Long> h=new HashMap<>();
                        h=data.get(lang);
                        h.put(IP,time);
                        data.put(lang,h);
                    }
                }
                else{
                    // System.out.println("Data ACCEPTED -> "+lang+" "+time+" "+IP);
                    answer.put(lang,answer.getOrDefault(lang,0)+1);
                    HashMap<String,Long> h=new HashMap<>();
                        h=data.get(lang);
                        h.put(IP,time);
                        data.put(lang,h);
                }
            }
            else{
                // System.out.println("Data ACCEPTED -> "+lang+" "+time+" "+IP);
                answer.put(lang,answer.getOrDefault(lang,0)+1);
                data.put(lang,d);
            }
        }
        System.out.println(answer);
    }
}

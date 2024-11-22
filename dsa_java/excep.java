package dsa_java;
import java.io.*;
import java.util.*;
public class excep {
    public static void main(String[] args) throws IOException {
        File f=new File("employees.csv");
        FileReader f2=new FileReader(f);
        BufferedReader b=new BufferedReader(f2);
        String s=b.readLine();
        String[] context;
        while(s!=null){
            try{
            System.out.println(s);
            s=b.readLine();
            context=s.split(",");
            System.out.println(context[0]+' '+context[1]+' '+context[2]+' '+context[3]);
            check_age(context[1]);
            check_dept(context[2]);
            check_sal(context[3]);
            }
            catch(Exception e)
            {break;}
        }
        System.out.println(" all Checks passed");
    }
    static void check_age(String x){
        try{
        int age=Integer.parseInt(x);
        if(age>65){
            throw new ageexception();
        }}
        catch(ageexception e){
            e.geterror();
        }
    }
    static void check_sal(String x){
        try{
        int age=Integer.parseInt(x);
        if(age<=10000){
            throw new salaryexception();
        }}
        catch(salaryexception e){
           e.geterror();
        }
    }
    static void check_dept(String x){
        try{
        if(x.equalsIgnoreCase("waterDept") && x.equalsIgnoreCase("accounts")){
            throw new departmentexception();
        }}
        catch(departmentexception e){
            e.geterror();
        }
    }
}
class salaryexception extends RuntimeException{
    public void geterror(){
        System.out.println("Error generated in salaryexception");
    }
}
class departmentexception extends RuntimeException{
    public void geterror(){
        System.out.println("Error generated in departmentexception");
    }
}
class ageexception extends RuntimeException{
    public void geterror(){
        System.out.println("Error generated in ageexception");
    }
}
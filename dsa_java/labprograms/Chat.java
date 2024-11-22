package dsa_java.labprograms;
import java.util.*;
import java.io.*;
public class Chat{
    public static void main(String args[]){
        Resource r1= new Resource("Question 1");
        ThreadClass t1=new ThreadClass(r1,"1");
        ThreadClass t2=new ThreadClass(r1,"2");
        ThreadClass t3=new ThreadClass(r1,"3");
        ThreadClass t4=new ThreadClass(r1,"4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
class Resource{
    String question;
    Resource(String s){
        this.question=s;
    }
    public synchronized void display(String name){
        System.out.println("Resource locked by "+name);
        try{
            Thread.sleep(1000);
            System.out.println("question");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Resource unlocked by "+name);
    }
    
}
class ThreadClass extends Thread{
    Resource R;
    String name;
    ThreadClass(Resource r1,String name){
        this.R=r1;
        this.name=name;
    }
    @Override
    public void run(){
        R.display(name);
    }
}
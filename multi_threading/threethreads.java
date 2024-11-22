package multi_threading;
import java.io.*;
public class threethreads {
    public static void main(String[] args) throws InterruptedException{
        MultiThreading1 t1=new MultiThreading1(0, 1, 10);
        MultiThreading2 t2=new MultiThreading2(1, 100, 250);
        MultiThreading3 t3=new MultiThreading3(2, 2000, 2100);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("All threads have been terminated");
    }
}
class MultiThreading1 extends Thread{
    private int threadnumber;
    private int start,end;
    MultiThreading1(int number,int start,int end){
        this.threadnumber=number;
        this.start=start;
        this.end=end;
    }
    @Override
    public void run(){
        System.out.println("Thread number "+threadnumber+" has started");
        for(int i=start;i<end;i++){
            System.out.println("Coming from thread "+threadnumber+" "+i);
        }
    }
}
class MultiThreading2 extends Thread{
    private int threadnumber;
    private int start,end;
    MultiThreading2(int number,int start,int end){
        this.threadnumber=number;
        this.start=start;
        this.end=end;
    }
    @Override
    public void run(){
        System.out.println("Thread number "+threadnumber+" has started");
        for(int i=start;i<end;i++){
            System.out.println("Coming from thread "+threadnumber+" "+i);
        }
    }
}
class MultiThreading3 extends Thread{
    private int threadnumber;
    private int start,end;
    MultiThreading3(int number,int start,int end){
        this.threadnumber=number;
        this.start=start;
        this.end=end;
    }
    @Override
    public void run(){
        System.out.println("Thread number "+threadnumber+" has started");
        for(int i=start;i<end;i++){
            System.out.println("Coming from thread "+threadnumber+" "+i);
        }
    }
}
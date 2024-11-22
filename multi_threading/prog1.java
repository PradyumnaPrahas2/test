package multi_threading;
public class prog1 {
    public static void main(String[] args) throws InterruptedException{
        MultiThreading thread=new MultiThreading(1);
        MultiThreading thread2=new MultiThreading(2);
        thread2.run();
        thread2.start();
        // thread2.start();
        // thread.start();
        // thread.join();
        // thread2.join();
        System.out.println("Both the are terminated");
    }
}
class MultiThreading extends Thread{
    private int threadnumber;
    MultiThreading(int number){
        this.threadnumber=number;
    }
    @Override
    public void run(){
        int ans=0;
        for(int i=0;i<threadnumber;i++){
            ans+=i+1;
        }
        System.out.println(ans+" coming from thread number "+threadnumber);
    }
}

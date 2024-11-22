package multi_threading;
public class prioritythreads {
    public static void main(String[] args) throws InterruptedException {
        MultiThreading m=new MultiThreading(1);
        MultiThreading m2=new MultiThreading(2);
        m.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(m.getState()+" "+m2.getState());
        m.start();
        m2.start();
        System.out.println(m.getState()+" "+m2.getState());
        System.out.println(m.getPriority()+" "+m2.getPriority());
        System.out.println(m.getName()+" "+m2.getName());
        System.out.println(m.getId()+" "+m2.getId());
        m.join();
        m2.join();
        System.out.println(m.getState()+" "+m2.getState());
    }
}
class MultiThreading extends Thread{
    public int id;
    MultiThreading(int name){
        this.id=name;
    }
    @Override
    public void run(){
        System.out.println("This is thread number "+id);
    }
}

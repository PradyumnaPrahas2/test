package pstest;

import java.util.Random;
public abstract class Bear implements h1,h2{
    public int m(){
        return 5;
    }
    public static void main(String[] args) {
        System.out.println(new dear().m());
    }
}
class dear extends Bear{
    protected int m(){
        return 8;
    }
}
interface h1{
    public static int m(){
        return 3;
    }
}
interface h2{
    default int m(){
        return 4;
    }
}
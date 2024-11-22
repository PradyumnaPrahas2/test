package pstest;
import java.util.*;
public class oops extends mammal{
    public oops(int f){
        super(f);
    }
    public static void main(String[] args) {
        new oops(3);
    }
    // public void ol(Object a){
    //     System.out.println("Object method");
    // }
    // public void ol(Number a){
    //     System.out.println("Number");
    // }
    // public void ol(Integer a){
    //     System.out.println("Integer");
    // }
    // public void ol(Double a){
    //     System.out.println("Double");
    // }
    // public static void main(String[] args) {
    //     oops s=null;
    //     s.ol(new oops());
    // }
}
class mammal extends animal{
    mammal(){
        System.out.println("MAMMAL");
    }
    public mammal(int age){
        super();
        super.method();
    }
}
class animal{
    animal(){
        System.out.println("ANIMAL");
    }
    protected void method(){
        System.out.println("ANIMAL METHOD");
    }
}
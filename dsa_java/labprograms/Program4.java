package dsa_java.labprograms;
import java.util.*;
public class Program4 {
    public static double method(List<Double> l){
        Double s= l.stream().mapToDouble(Double::doubleValue).sum();
        String ans=String.format("%.2f",s);
        return Double.valueOf(ans);
    }
    public static void main(String args[]){
        List<Double> l=new Stack<>();
        l.add(13.7);
        l.add(-26.2);
        l.add(46.3);
        l.add(37.4);
        l.add(-66.9);
        System.out.println(method(l));
    }
}

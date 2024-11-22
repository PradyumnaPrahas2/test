package labs;
import java.util.*;
public class a1 {
    public static void main(String[] args){
        int n;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        String s;
        s=String.valueOf(n);
        int res=(s.charAt(0)-'0')*10+(s.charAt(s.length()-1)-'0');
        // System.out.println((s.charAt(0)-'0')+" "+(s.charAt(s.length()-1)-'0'));
        System.out.print(n%res==0);
    }
}

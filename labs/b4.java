package labs;
import java.util.*;
public class b4 {
    public static void main(String[] args) {
        String s1="apple",s2="box";
        String ans="";
        int a=s1.length(),b=s2.length();
        for(int i=0;i<Math.max(a,b);i++){
            if(i<a){
                ans+=s1.charAt(i);
            }
            if(i<b){
                ans+=s2.charAt(i);
            }
        }
        System.out.println(ans);
    }
}

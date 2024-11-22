package stringmatchingalgo;
import java.util.*;
public class KMP {
    public static int[] GenerateArray(String pattern){
        int[] lp=new int[pattern.length()];
        int length=0;
        lp[0]=0;
        for(int i=1;i<pattern.length();i++){
            if(pattern.charAt(i)==pattern.charAt(length)){
                length++;
                lp[i]=length;
            }
            else{
                if(length!=0){
                    length=lp[length-1];
                }
                else{
                    lp[i]=0;
                }
            }
        }
        return lp;
    }
    public static boolean Match(String string,String pattern){
        int[] lp=GenerateArray(pattern);
        int i=0; // -> for string
        int j=0;// -> for pattern
        while(i<string.length()){
            if(pattern.charAt(j)==string.charAt(i)){
                i++;
                j++;
            }
            if(j==pattern.length()){
                return true;
            }
            else if(i<string.length() && pattern.charAt(j)!=string.charAt(i)){
                if(j!=0){
                    j=lp[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        // normal string matching -> O(n*m)
        // Knuth-Morris-Pratt Algorithm -> O(n+m)
        String string="ababcabcabababd".toLowerCase();
        String pattern="ababbd";
        System.out.print(Match(string,pattern));
    }
}

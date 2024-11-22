package stringmatchingalgo;
// Sliding Window approach
public class RobinSM {
    public static long hashCode;
    public static boolean Robin_match(String string,String pattern){

        long window_hashCode=0;
        for(int i=0;i<pattern.length();i++){
            window_hashCode+=(string.charAt(i)-'a')*Math.pow(10,pattern.length()-1-i);
        }
        for(int i=pattern.length();i<string.length();i++){
            double removingchar=(string.charAt(i-pattern.length())-'a')*Math.pow(10,pattern.length()-1);
            window_hashCode-=removingchar;
            window_hashCode*=10;
            window_hashCode+=string.charAt(i)-'a';
            if(hashCode==window_hashCode) return true;
            
        }
        return false;
    }
    public static void main(String[] args){
        String string="THIS IS A TEST TEXT";
        String pattern="TEST";
        for(int i=0;i<pattern.length();i++){
            hashCode+=(pattern.charAt(i)-'a')*Math.pow(10,pattern.length()-1-i);
        }
        System.out.print(Robin_match(string,pattern));
    }
}

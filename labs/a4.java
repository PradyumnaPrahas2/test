package labs;
import java.util.*;
public class a4 {
    public static void main(String[] args){
        String s1="abcdefgh";
        String s2="bddgj";
        int r=s1.length();
        int c=s2.length();
        int[][] dp=new int[r+1][c+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[r][c]);
    }
}

package labs;
import java.util.*;
public class b3 {
    public static void main(String[] args){
        int n=5;
        int ele=1;
        int[][] dp=new int[n][n];
        int row=0,col=0;
        int arow=5,acol=5;
        while(row<arow && col<acol){
            for(int i=col;i<acol;i++){
                dp[row][i]=ele;
                ele++;
            }
            row++;
            for(int i=row;i<arow;i++){
                dp[i][acol-1]=ele;
                ele++;
            }
            acol--;
            for(int i=acol-1;i>=col;i--){
                dp[arow-1][i]=ele;
                ele++;
            }
            arow--;
            for(int i=arow-1;i>=row;i--){
                dp[i][col]=ele;
                ele++;
            }
            col++;
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}

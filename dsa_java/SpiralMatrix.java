package dsa_java;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int[][] visited={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int max_row=arr.length-1,max_col=arr[0].length-1;
        int min_row=0,min_col=0;
        int [][] visited=new int [max_row+1][1+max_col];
        for(int i=0;i<max_row+1;i++){
            Arrays.fill(visited[i],0);
        }
        while(min_row<=max_row && min_col<=max_col){
            int i=min_row;
            while(i<=max_col){
                if(visited[min_row][i]==0){
                System.out.print(arr[min_row][i]+" ");
                visited[min_row][i]=1;
                }
                i++;
            }
            min_row++;
            i=min_row;
            while(i<=max_row){
                if(visited[i][max_col]==0){
                System.out.print(arr[i][max_col]+" ");
                visited[i][max_col]=1;
                }
                i++;
            }
            max_col--;
            i=max_col;
            while(i>=min_col){
                if(visited[max_row][i]==0){
                System.out.print(arr[max_row][i]+" ");
                visited[max_row][i]=1;
                }
                i--;
            }
            max_row--;
            i=max_row;
            while(i>=min_row){
                if(visited[i][min_col]==0){
                System.out.print(arr[i][min_col]+" ");
                visited[i][min_col]=1;
                }
                i--;
            }
            min_col++;
        }
        System.out.println("\nThis is the Spiral order of the matrix");
    }
}

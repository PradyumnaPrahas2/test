package pstest;
import java.util.*;
public class que3 {
    public static void main(String[] args) {
        Scanner x=new Scanner (System.in);
        int r=x.nextInt();
        int c=x.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=x.nextInt();
            }
        }
        int a=0,b=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                PriorityQueue<Integer> pq=new PriorityQueue<>();
                int k=i,l=j;
                while(k<r && l<c){
                    pq.add(arr[k][l]);
                    k++;
                    l++;
                }
                k=i;l=j;
                while(k<r && l<c){
                    arr[k][l]=pq.poll();
                    // pq.add(arr[k][l]);
                    k++;
                    l++;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

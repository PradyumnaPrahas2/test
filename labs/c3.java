package labs;
import java.util.*;
public class c3 {
    public static void main(String[] args){
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int max1=0,max2=0;
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        for(int i=0;i<n;i++){
            max1=Math.max(max1,arr[i]);
            left[i]=max1;
        }
        for(int i=n-1;i>=0;i--){
            max2=Math.max(max2,arr[i]);
            right[i]=max2;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(Math.min(left[i],right[i])-arr[i]>=0){
                ans+=Math.min(left[i],right[i])-arr[i];
            }
        }
        System.out.println(ans);
    }
}

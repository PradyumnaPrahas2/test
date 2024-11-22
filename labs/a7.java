package labs;
import java.util.*;
public class a7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int [] dp=new int[arr.size()];
        dp[0]=arr.get(0);
        for(int i=1;i<arr.size();i++){
            dp[i]=dp[i-1]+arr.get(i);
        }
        System.out.println(Arrays.toString(dp));
    }
}

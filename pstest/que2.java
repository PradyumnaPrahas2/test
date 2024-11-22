package pstest;
import java.util.*;
public class que2 {
    public static int deleteele(String[] s,String k){
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<s.length;i++){
            h.put(s[i],h.getOrDefault(s[i],0)+1);
        }
        h.put(k,0);
        int ans=0;
        for(String j:h.keySet()){
            ans+=h.get(j);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String[] x=a.next().split(",");
        System.out.println("Enter ele to be deleted");
        String n=a.next();
        System.out.println(deleteele(x,n));
    }
}

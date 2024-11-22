package labs;
import java.util.*;
public class c4 {
    public static HashMap<Character,ArrayList<String>> dic=new HashMap<>();
    public static ArrayList<String> getResult(char s){
        return dic.getOrDefault(s,new ArrayList<>());
    }
    public static ArrayList<String> modify(ArrayList<String> a1,ArrayList<String> a2){
        if(a1.size()==0){
            return a2;
        }
        ArrayList<String> dup=new ArrayList<>();
        for(int i=0;i<a1.size();i++){
            String v=a1.get(i);
            for(int j=0;j<a2.size();j++){
                dup.add(v+a2.get(j));
            }
        }
        return dup;
    }
    public static void main(String[] args){
        dic.put('2',new ArrayList<>(Arrays.asList("a","b","c")));
        dic.put('3',new ArrayList<>(Arrays.asList("d","e","f")));
        dic.put('4',new ArrayList<>(Arrays.asList("g","h","i")));
        dic.put('5',new ArrayList<>(Arrays.asList("j","k","l")));
        dic.put('6',new ArrayList<>(Arrays.asList("m","n","o")));
        dic.put('7',new ArrayList<>(Arrays.asList("p","q","r","s")));
        dic.put('8',new ArrayList<>(Arrays.asList("t","u","v")));
        dic.put('9',new ArrayList<>(Arrays.asList("w","x","y","z")));
        String n;
        Scanner x=new Scanner(System.in);
        n=x.next();
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<n.length();i++){
            ArrayList<String> a1=getResult(n.charAt(i));
            ans=modify(ans,a1);
        }
        System.out.println(ans.get(ans.indexOf("amazon")));
    }
}

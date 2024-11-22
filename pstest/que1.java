package pstest;
import java.util.*;
public class que1 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        int y=x;
        while(true && y>0){
            if((int)x/y>=y){
                System.out.println(y);
                break;
            }
            y--;
        }
    }
}

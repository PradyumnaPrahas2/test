package labs;

import java.util.*;

public class a3 {
    public static void main(String[] args) {
        int ma = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            int n = new Scanner(System.in).nextInt();
            ma = Math.max(ma, n);
            mi = Math.min(mi, n);
        }
        System.out.println(ma - mi);
    }
}

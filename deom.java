import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner m= new Scanner(System.in);
        Scanner n= new Scanner(System.in);
        int x=m.nextInt();
        int y=n.nextInt();
        System.out.println(x+y);
        m.close();
        n.close();
    }
}
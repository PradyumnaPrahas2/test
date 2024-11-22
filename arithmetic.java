import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter first value:");
        // int x=new Scanner(System.in)
        int n1=x.nextInt();
        System.out.println("Enter second number:");
        int n2=x.nextInt();
        System.out.println("Addition of the two numbers are:"+(n1+n2));
        System.out.println("Subtraction of the two numbers are:"+(n1-n2));
        System.out.println("Multiplication of the two numbers are:"+(n1*n2));
        System.out.println("Division of the two numbers are:"+(n1/n2));
        System.out.println("Modulus of the two numbers are:"+(n1%n2));
        System.out.println("AND of the two numbers are:"+(n1&n2));
        System.out.println("OR of the two numbers are:"+(n1|n2));
        System.out.println("XOR of the two numbers are:"+(n1^n2));
        x.close();
    }
}

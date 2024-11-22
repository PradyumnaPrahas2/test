import java.util.Scanner;

public class bank {
    String name, bankname;
    int amount, id;

    public bank(String name, String bankname, int amount, int id) {
        this.name = name;
        this.bankname = bankname;
        this.amount = amount;
        this.id = id;
    }

    public void Balance() {
        System.out.println("INR " + amount);
    }

    public void Check() {
        System.out.println("Name:" + name + "\nBANK:" + bankname + "\nBALANCE:INR " + amount + "\nIDNO:" + id);
    }

    public void Deposit(int value) {
        amount = amount + value;
        System.out.println("Successfully added the amount in your account, here is your updated bank balance:");
        Balance();
    }

    public void Withdraw(int value) {
        if (amount < value) {
            System.out.println("Insufficient Balance cannot withdraw");
        } else {
            amount = amount - value;
            System.out.println("Amount withdrawn Successfully Here is your updated bank balance:");
            Balance();
        }
    }

    public static void main(String[] args) {
        int amount = 7000000;
        int id = 4011;
        String name = "PRAHAS";
        String bankname = "HDFC";
        int amount2 = 45000;
        int id2 = 4013;
        String name2 = "Jade";
        String bankname2 = "HDFC";
        bank myBank = new bank(name, bankname, amount, id);
        bank myBank2=new bank(name2,bankname2,amount2,id2);
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        int ch = -1;
        while (ch != 0) {
            System.out.println("1.Deposit\n2.Check balance\n3.Withdraw\n4.View ALL Details\n5.Transfer ");
            int a = z.nextInt();
            if (a == 1) {
                System.out.println("Enter amount that you want to deposit in your bank account(INR):");
                int amt = y.nextInt();
                myBank.Deposit(amt);
            } else if (a == 4) {
                System.out.println("Here are your details");
                myBank.Check();
            } else if (a == 3) {
                System.out.println("Enter amount that you want to withdraw from your bank account(INR):");
                int amt = y.nextInt();
                myBank.Withdraw(amt);
            } else if (a == 2) {
                System.out.println("Here are your details");
                myBank.Balance();
            }
            else if(a==5)
            {
                System.out.println("enter amount to transfer from first acc to second:");
                int amt=y.nextInt();
                myBank.Withdraw(amt);
                myBank2.Deposit(amt);
                System.out.println("The updated details of the first account is");
                myBank.Check();
                System.out.println("The updated details of the second account is");
                myBank2.Check();
            }
            else {
                System.out.println("Invalid Input TRY AGAIN");
            }
            System.out.println("\nDo you want to continue\n0->NO\n1->YES");
            ch = k.nextInt();
        }
        System.out.println("Thank you");
        x.close();
        y.close();
        z.close();
        k.close();
    }
}

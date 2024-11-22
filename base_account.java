import java.util.Scanner;

class current extends base_account{
    private int withdrawal_amount;
    private int transaction_fee;
    private int transactions;
    private double balance;
    private long limit=Integer.MAX_VALUE;
    private String name;
    private String id;
    current(String name,double balance,String id){
        this.name=name;
        this.balance=balance;
        this.id=id;
        this.transactions=0;
    }
    public int deposit(int deposit_amount){
        double tax=2*deposit_amount/100;
        this.balance+=deposit_amount-tax;
        transactions++;
        System.out.println("Amount added successfully!");
        System.out.println("Transaction fee(2%):"+tax);
        return 0;
    }
    public int withdraw(int withdrawal_amount){
        if(withdrawal_amount>balance){
            System.out.println("Cannot withdraw specifyed amount because of insufficient balance");
            return 1;
        }
        else{
            transactions++;
            this.balance-=withdrawal_amount;
            return 0;
        }
    }
    public void account_details(){
        System.out.println("Name:"+name);
        System.out.println("Bank:"+id);
        System.out.println("Balance:"+balance);
        System.out.println("Transactions:"+transactions);
    }
}

class savings extends base_account {
    private double balance;
    private int limited=3;
    private int limit=50000;
    private int limitd=250000;
    private int transactions;
    private String name;
    private String id;
    savings(String name,double balance,String id){
        this.name=name;
        this.balance=balance;
        this.id=id;
        this.transactions=0;
    }
    public int deposit(int deposit_amount){
        if(transactions<limited){
        if(limitd>=deposit_amount){
        this.balance+=deposit_amount;
        transactions++;
        System.out.println("Amount added successfully!");
        return 0;
        }
        else{
            System.out.println("Cannot add more than "+limitd+" at a time");
            return 1;
        }}
        else{
            System.out.println("Max Transaction limit reached!");
            return 1;
        }
    }
    public int withdraw(int withdrawal_amount){
        if(transactions<limited){
        if(withdrawal_amount<=limit){
        if(withdrawal_amount>balance){
            System.out.println("Cannot withdraw specifyed amount because of insufficient balance");
            return 1;
        }
        else{
            transactions++;
            double interest=balance*0.7/100;
            this.balance-=withdrawal_amount+interest;
            return 0;
        }
        }
        else{
            System.out.println("You can withdraw upto only 50000Rs at an instance from savings account");
            return 1;
        }
    }
    else{
        System.out.println("Max Transaction limit reached!");
        return 1;
    }
    }
    public void account_details(){
        System.out.println("Name:"+name);
        System.out.println("Bank:"+id);
        System.out.println("Balance:"+balance);
        System.out.println("Transactions:"+transactions);
    }

}

public class base_account {
    public static void main(String[] args) {
        savings acc1=new savings("Pradyumna",400000,"HDFC");
        current acc2=new current("Pradyumna",4000000,"SBI");
        Scanner x=new Scanner(System.in);
        Scanner y=new Scanner(System.in);
        int ch=0;
        Scanner z=new Scanner(System.in);
        while(ch==0){
            System.out.println("Select your account\n1.for savings account 2.for current account");
            int acc=x.nextInt();
            if(acc==1){
                System.out.println("Enter operation \n 1.deposit 2.withdraw 3.transfer 4.details");
                int op=y.nextInt();
                if(op==1){
                    int amt=y.nextInt();
                    acc1.deposit(amt);
                }
                else if(op==2){
                    int amt=y.nextInt();
                    acc1.withdraw(amt);
                }
                else if(op==3){
                    int amt=y.nextInt();
                    if(acc1.withdraw(amt)==0){
                        if(acc2.deposit(amt)==0){
                            System.out.println("Transaction Successfull");
                        }
                        else{
                            System.out.println("Transaction Failed");
                            acc1.deposit(amt);
                        }
                    }
                }
                else if(op==4){
                    acc1.account_details();
                }
            }
            else
            {
                System.out.println("Enter operation \n 1.deposit 2.withdraw 3.transfer 4.details");
                    int op=y.nextInt();
                    if(op==1){
                        int amt=y.nextInt();
                        acc2.deposit(amt);
                    }
                    else if(op==2){
                        int amt=y.nextInt();
                        acc2.withdraw(amt);
                    }
                    else if(op==3){
                        int amt=y.nextInt();
                        if(acc2.withdraw(amt)==0){
                            if(acc1.deposit(amt)==0){
                                System.out.println("Transaction Successfull");
                            }
                            else{
                                System.out.println("Transaction Failed");
                                acc2.deposit(amt);
                            }
                        }
                    }
                    else if(op==4){
                        acc2.account_details();
                    }
                }
            System.out.println("\nDo you want to continue?:(y->0/n->1)");
            ch=z.nextInt();
        }
        x.close();
        y.close();
        z.close();
    }
}
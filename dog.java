import java.util.Scanner;
class Dog {
    String name,age,breed,owner;
    public Dog(String name,String breed,String age,String owner){
        this.name=name;
        this.age=age;
        this.breed=breed;
        this.owner=owner;
    }
    public void getAge()
    {
        System.out.println(age);
    }
    public void getBreed(){
        System.out.println(breed);
    }
    public void getName(){
        System.out.println(name);
    }
    public void getOwner(){
        System.out.println(owner);
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        Scanner y=new Scanner(System.in);
        String name="TUPI",breed="Pomeranian",age="3yrs",owner="PradyumnaPrahas";
        Dog myDog=new Dog(name,breed,age,owner);
        String ch="0";
        do{
            System.out.println("1.NAME\n2.BREED\n3.AGE\n4.OWNER");
            int n=x.nextInt();
            if(n==1){
            myDog.getName();
            }
            else if(n==2){
            myDog.getBreed();
            }
            else if(n==4){
            myDog.getOwner();
            }
            else if(n==3){
            myDog.getAge();
            }
            else{
                System.out.println("INVALID INPUT");
                break;
            }
            System.out.println("Enter 0 if you want to continue else 1");
            ch=y.nextLine();
        }
        while(ch!="1");
        x.close();
        y.close();
    }
}

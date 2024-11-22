class person {
    String name,croom;
    int id;
    public person(){
        this.name="";
        this.croom="";   
        this.id=0; 
    }
    void name(String name){
        this.name=name;
        // System.out.println("name assigned in person class");
    }
    void croom(String croom){
        this.croom=croom;
        // System.out.println("class room assigned in person class");
    }
    void id(int id){
        this.id=id;
        // System.out.println("id assigned in person class");
    }
    int age(){
        return id;
    }
}
class student extends person{
    String subject;
    double total_marks;
    student(){
        this.subject="";
    }
    void marks(int [] marks){
        int v=0;
        for(int i=0;i<marks.length;i++){
            v=v+marks[i];
        }
        this.total_marks=v*100/(marks.length*100);
        // System.out.println("marks assigned in student class");
    }
    void subj(String subject){
        this.subject=subject;
        // System.out.println("student assigned in student class");
    }
    double calculate(){
        System.out.println(name+" of class "+croom+" and id "+id);
        if(total_marks>56){
            System.out.println("This student has qualified with cgpa "+total_marks/10);
            return total_marks/10;
        }
        else{
            System.out.println("Not qualified with cgpa "+total_marks/10);
            return total_marks/10;
        }
    }
}
public class inheritance{
    public static void main(String[] args) {
        // System.out.println("Enter name");
        // Scanner x=new Scanner(System.in);
        // Scanner y=new Scanner(System.in);
        // Scanner z=new Scanner(System.in);
        // String n=x.nextLine();
        // System.out.println("Enter class");
        // String m=y.nextLine();
        // System.out.println("Enter id");
        // int k=z.nextInt();
        // System.out.println("Enter subject");
        // String a=y.nextLine();
        // System.out.println("Enter marks");
        String n="PRAHAS",m="CSM-A",n2="Jade",m2="CSE-A";
        int k=18,k2=21;
        // int marks1=60,marks2=79,marks3=87,marks4=90,marks5=69;
        // int Marks1=60,Marks2=20,Marks3=8,Marks4=9,Marks5=69;
        int[] arr1={90,79,97,90,69};
        int[] arr2={60,20,8,9,69};
        student s=new student();
        student s2=new student();
        s.name(n);
        s.croom(m);
        s.id(k);
        s.marks(arr1);
        if(s.calculate()>=8 & s.age()>=18){
            System.out.println("You can apply for universities\n");
        }
        else{
            System.out.println("You cant apply for universities\n");
        }
        s2.name(n2);
        s2.croom(m2);
        s2.id(k2);
        s2.marks(arr2);
        if(s2.calculate()>=8 & s2.age()>=18){
            System.out.println("You can apply for universities\n");
        }
        else{
        System.out.println("You cant apply for universities\n");
        }
    }
}
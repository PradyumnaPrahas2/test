public class Studenttask {
    public static void main(String[] args) {
        student2 s=new student2("Prahas",50,"CSM-A");
        student2 s2=new student2("Rajiv",51,"CSM-A");
        student2 s3=new student2("Hemanth",52,"CSM-A");
        student2 s4=new student2("Sohan",53,"CSM-A");
        student2 s5=new student2("Abhinav",54,"CSM-A");
        teacher t=new teacher("Deepa Ganu","JAVA");
        t.markattendance(s, true);
        t.markattendance(s2, true);
        t.markattendance(s3, false);
        t.markattendance( s4,false);
        t.markattendance( s5,true);
    }
}

class student2{
    private String name;
    private int roll;
    private String section;
    public student2(String name,int roll,String section){
        this.name=name;
        this.roll=roll;
        this.section=section;
    }
    public void viewdetails(){
        System.out.print(name+' '+roll+' '+section);
    }
    
}
class teacher{
    private String name;
    private String subject;
    private student2 s;
    public teacher(String name,String subject){
        this.name=name;
        this.subject=subject;
    }
    public void markattendance(student2 s,boolean today){
        s.viewdetails();
        String s3;
        if(today==false){
            s3="absent";
        }
        else{
            s3="present";
        }
        System.out.print(" has been marked "+s3+" for "+subject+" by "+name);
        System.out.println();
    }
}

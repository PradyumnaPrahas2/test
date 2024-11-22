package pstest;

public class GrandChild extends Child{
    public String name="Prahas";
    public void education(){
        System.out.println("NAME:- PRADYUMNA PRAHAS");
        System.out.println("GENDER:- MALE\nCOLLEGE:- KMIT\nMARKS(GPA):- 9.4");
    }
    public void parentdetails(){
        super.education();
    }
    public static void main(String[] args){
        Me c=new GrandChild();
        c.education();
        // System.out.print(c.name);
    }
}
class Child extends Me{
    protected String name="Prasanna kumar";
    public void education(){
        System.out.println("NAME:- PRASANNA KUMAR");
        System.out.println("GENDER:- MALE\nCOLLEGE:- AU\nMARKS(GPA):- 8.4");
    }
    public void parentdetails(){
        super.education();
    }
}
class Me{
    private String name="Grandfather";
    private void education(){
        System.out.println("NAME:- GOPALA KRISHNA");
        System.out.println("GENDER:- MALE\nCOLLEGE:- IITK\nMARKS(GPA):- 7.4");
    }
    public void parentdetails(){
        System.out.println("NO RECORDS FOUND");
    }
}
interface HasExoskeleton {
default int getNumberOfSections(){
    return 9;
};
 }
abstract class Insect implements HasExoskeleton {
abstract int getNumberOfLegs();
public abstract int getNumberOfSections();
}
class Beetle extends Insect {
int getNumberOfLegs() { return 6; }
public int getNumberOfSections(){return 7;}
}
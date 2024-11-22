class worker{
    protected int id;
    protected String name;
    protected double salary,wage;
    protected float hours;
    protected double basicpay;
    protected double hra;
    protected int experience;
    public worker(String name,double wage,float hours){
        this.name=name;
        this.wage=wage;
        this.hours=hours;
    }
    public worker(String name,int id,double basicpay,double hra,int experience){
        this.name=name;
        this.id=id;
        this.basicpay=basicpay;
        this.hra=hra;
        this.experience=experience;
    }
    void calculatesalary() {
        System.out.println("70000");
    }
}
class permanentworker extends worker{
    public permanentworker(String name,int id,double basicpay,double hra,int experience){
        super(name,id,basicpay,hra,experience);
    }
    @Override
    public void calculatesalary(){
        System.out.println(basicpay+hra*experience);
    }
}
class contractworker extends worker{
    public contractworker(String name,double wage,float hours){
        super(name,wage,hours);
    }
    @Override 
    public void calculatesalary(){
        System.out.println(wage*hours);
    }

}
public class employee {
    public static void main(String[] args) {
        contractworker c=new contractworker("Kyle", 1000, 6.8f);
        c.calculatesalary();
        permanentworker p=new permanentworker("Mayer", 271, 90000, 4503, 10);
        p.calculatesalary();
    }
}

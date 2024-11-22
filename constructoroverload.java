class Registration{
    private String name="-",pan="-",pass="-";
    private int license=0,voterid=0;
    private long telephone1,telephone2;
    public Registration(String name,long telephone1,long telephone2,String pass){
        this.name=name;
        this.telephone1=telephone1;
        this.telephone2=telephone2;
        this.pass=pass;
    }
    public Registration(String name,long telephone1,long telephone2,String pan,int license){
        this.name=name;
        this.telephone1=telephone1;
        this.telephone2=telephone2;
        this.pan=pan;
        this.license=license;
    }
    public Registration(String name,long telephone1,long telephone2,int voterid,String pan){
        this.name=name;
        this.telephone1=telephone1;
        this.telephone2=telephone2;
        this.pan=pan;
        this.voterid=voterid;
    }
    public Registration(String name,long telephone1,long telephone2,int voterid,int license){
        this.name=name;
        this.telephone1=telephone1;
        this.telephone2=telephone2;
        this.voterid=voterid;
        this.license=license;
    }
    public void show_details(){
        System.out.println("NAME: "+name);
        System.out.println("Phone number(s): "+telephone1+" and "+telephone2);
        System.out.println("voterid: "+voterid);
        System.out.println("license: "+license);
        System.out.println("Pan number: "+pan);
        System.out.println("Passport number: "+pass);
    }
}
public class constructoroverload {
    public static void main(String args[]){
        Registration r=new Registration("Kevin",9849738965L,7032638888L,188002,"jK09163");
        r.show_details();
    }
}

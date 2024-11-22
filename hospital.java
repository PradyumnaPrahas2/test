import java.util.Scanner;
public class hospital {
    public static void main(String[] args) {
        doctor[] list=new doctor[7];
        list[0]=new doctor("Albrert","M","A",43,999999999,"Neurologist",5);
        list[1]=new doctor("Jonas","M","B",33,999999909,"Dentist",3);
        list[2]=new doctor("Kret","F","C",49,999999799,"Cardoiologist",1);
        list[3]=new doctor("Mark","M","D",28,999993999,"Orthologist",8);
        list[4]=new doctor("Donald","M","E",59,999991999,"Dermatologist",5);
        list[5]=new doctor("John","M","F",57,929999999,"Pulmonologist",0);
        list[6]=new doctor("Jade","M","F",57,929999999,"Pulmonologist",7);
        enquiry e1=new enquiry("Prahas",19,98498965,"lung infection","Pulmonologist","West marredpally",false);
        e1.suggest(list);
    }
}
class enquiry{
    private String name,pain,looking_for,address;
    private int age;
    private long ph;
    private boolean suffered_before;
    enquiry(String name,int age,long ph,String pain,String looking_for,String address,boolean suffered_before){
        this.name=name;
        this.age=age;
        this.ph=ph;
        this.pain=pain;
        this.looking_for=looking_for;
        this.address=address;
        this.suffered_before=suffered_before;
    }
    public void suggest(doctor[] doctors){
        for(doctor i:doctors){
            if(i.speciality==this.looking_for){
                if(i.curr<i.limit){
                    i.getdetails();
                }
            //     if(i.curr<i.limit){
            //     System.out.println("Do you want to enroll this doctor:(y/n):-");
            //     Scanner x=new Scanner(System.in);
            //     int c= x.nextInt();
            //     if(c==1){
            //         i.curr++;
            //     }
            //     x.close();
            // }

            }
        }
    }
}
class doctor{
    public String name,speciality,gender,hospital;
    public int age;
    public long phone;
    public int limit;
    public int curr;
    doctor(String name,String gender,String hospital,int age,long phone,String speciality,int limit){
        this.name=name;
        this.gender=gender;
        this.hospital=hospital;
        this.age=age;
        this.phone=phone;
        this.speciality=speciality;
        this.curr=0;
        this.limit=limit;
    }
    public void getdetails(){
        System.out.println(name+" "+gender+" "+age+" "+hospital+" "+speciality+" "+phone);
    }
}

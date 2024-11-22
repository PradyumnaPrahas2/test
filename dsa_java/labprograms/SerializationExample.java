package dsa_java.labprograms;
import java.io.*;
public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        employee e=new employee("Prahas", 1);
        System.out.println("Original Object "+e);
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employee.ser"))){
            oos.writeObject(e);
            System.out.println("Employee Serialized "+oos);
        }
        catch(Exception e1){
            System.out.println(e1);
        }
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employee.ser"))){
            employee e2=(employee)ois.readObject();
            System.out.println("Employee deserialized "+e2);
        }
        catch(Exception e3){
            System.out.println(e3);
        }
    }
}

class employee implements Serializable{
    public static int n;
    public static String s;
    employee(String s,int n){
        this.s=s;
        this.n=n;
    }
    @Override
    public String toString() {
        return "Employee{name='" + s + "', id=" + n + "}";
    }
}
package dsa_java.labprograms;
import java.util.*;
import java.io.*;
public class question3 {
    public static ArrayList<ArrayList<String>> answers=new ArrayList<>();
    public static void main(String args[]) throws InterruptedException{
        ArrayList<String> question=new ArrayList<>();
        ArrayList<String> actualans=new ArrayList<>();
        question.add("What is capital of India");
        actualans.add("Delhi");
        question.add("What is largest planet of the solar system");
        actualans.add("Jupiter");
        question.add("What is capital of Telangana");
        actualans.add("Hyderabad");
        for(int i=0;i<question.size();i++){
            answers.add(new ArrayList<String>());
        }
        for(int i=0;i<question.size();i++){
            System.out.println("BOT:- "+question.get(i));
            Mythread t1=new Mythread(i, answers,1);
            Mythread t2=new Mythread(i, answers,2);
            Mythread t3=new Mythread(i, answers,3);
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
        ArrayList<Integer> marks=new ArrayList<>(Collections.nCopies(3, 0));
        for(int i=0;i< question.size();i++){
            ArrayList<String> dp=answers.get(i);
            for(int j=0;j<dp.size();j++){
                if(dp.get(j).equalsIgnoreCase(actualans.get(i))){
                    marks.set(j,marks.get(j)+1);
                }
                else{
                    marks.set(j,marks.get(j)-1);
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println("Marks achieved by user "+(i+1)+" is "+marks.get(i));
        }
    }
}
class Mythread extends Thread{
    public int id,threadno;
    ArrayList<ArrayList<String>> answers;
    Mythread(int qno,ArrayList<ArrayList<String>> answers,int tno){
        this.id=qno;
        this.answers=answers;
        this.threadno=tno;
    }
    @Override
    public void run(){
        System.out.println("User "+threadno);
        Scanner x=new Scanner(System.in);
        String ans=x.nextLine();
        answers.get(id).add(ans);
    }
}
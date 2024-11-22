import java.util.ArrayList;
public class LinkedList{
    public static void main(String[] args) {
        List l=new List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        // l.print();
        // l.deletel(7);
        l.reverselist();
        l.print();
    }
}

class Node {
    int data;
    Node next;
}
class List{
    private Node head,tail;
    List(){
        head=null;
        tail=null;
    }
    void add(int val){
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=null;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void deletel(int val){
        Node temp=head,temp2=head;
        ArrayList<Integer> vector=new ArrayList<>();
        while(temp!=null){
            if(temp.data!=val){
                vector.add(temp.data);
            }
            temp=temp.next;
        }
        for(int i=0;i<vector.size();i++){
            if(i==vector.size()-1){
                temp2.data=vector.get(i);
                temp2.next=null;
            }
            else{
            temp2.data=vector.get(i);
            temp2=temp2.next;
            }
        }
        return;
    }
    void print(){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    void reverselist(){
        Node temp=head;
        Node temp1=null;
        Node temp2=null;
        while(temp!=null){
            temp2=temp.next;
            temp.next=temp1;
            temp1=temp;
            temp=temp2;
        }
        head=temp1;
    }
}
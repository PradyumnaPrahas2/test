class Node{
    int data;
    Node next;
    Node prev;
}
class DL{
    private Node head,tail;
    DL(){
        head=null;
        tail=null;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL\n");
    }
    void add(int val){
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=null;
        newNode.prev=null;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    void deletel(int val){
        Node temp=head;
        while(head.data==val){
            head=head.next;
        }
        while(temp!=null){
            if(temp.data==val){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
            temp=temp.next;
        }
    }
}
public class doublelinked {
    public static void main(String[] args) {
        DL dll=new DL();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        // dll.print();
        dll.deletel(4);
        dll.deletel(3);
        dll.print();
    }
}

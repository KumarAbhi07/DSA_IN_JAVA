package LinkedLIst;

public class ReverseLinkedinListPointerIterative {
    public static class Node{
        int data;
        Node next;
    }
    public static class linkedlist{
        Node head;
        Node tail;
        int size;

        void addlast(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;


            }
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void reversePI(){
            Node pre= null;
            Node curr=head;
            while(curr!=null){
                Node next=curr.next;

                curr.next=pre;
                pre=curr;
                curr=next;
            }
            Node temp=head;
            head=tail;
            tail=temp;

        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addlast(1);
        ll.addlast(12);
        ll.addlast(45);
        ll.addlast(6);
        ll.addlast(7);
        ll.display();
        ll.reversePI();
        ll.display();
    }
}

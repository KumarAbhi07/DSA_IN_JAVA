package LinkedLIst;

public class addFirst {
    public static class Node {
        int data;
        Node next;
    }

    public static class linkedlist {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
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
        void addFirst(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            if(size==0){
                tail=temp;
            }
            size++;
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addLast(12);
        ll.addLast(34);
        ll.addLast(78);
        ll.addLast(39);
        ll.display();
        ll.addFirst(37);
        ll.addFirst(56);
        ll.display();
    }
}

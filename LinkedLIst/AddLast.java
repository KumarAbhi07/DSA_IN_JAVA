package LinkedLIst;

public class AddLast {
    // implementation of linkedlist using class
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;

            if(size==0){
                head=tail=temp;
            }else{
                tail.next =temp;
                tail=temp;
            }
            size++;
        }

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(334);
        ll.addLast(67);
    }

}

package LinkedLIst;

public class MiddleElement {
    public static class Node{
        int data;
        Node next;
    }
    public static class linkedlist {
        Node head;
        Node tail;
        int size;
        void addLast(int val){
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
    public int mid(){
            Node s=head;
            Node f=head;
            while(f.next!=null && f.next.next!=null){
                s=s.next;
                f=f.next.next;
            }
            return s.data;
        }
    }

    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addLast(121);
        list.addLast(67);
        list.addLast(69);
        list.addLast(60);
        list.addLast(45);
        list.addLast(17);
        list.addLast(4);
        list.addLast(87);
        list.addLast(7);
        list.addLast(6);
        list.addLast(1);
        list.addLast(189);
        list.addLast(1078);
        list.addLast(105);
        list.addLast(190);
        list.addLast(10);
        System.out.println(list.mid());
    }
}

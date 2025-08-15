package LinkedLIst;

public class DisplayAndSize {
    public static class Node{
        int data;
        Node next;
    }
    public static class Linkedlist{
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
        public int  size(){
            return size;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addLast(34);
        ll.addLast(3);
        ll.addLast(78);
        ll.addLast(9900);

        System.out.println(ll.size());
        ll.display();

    }
}

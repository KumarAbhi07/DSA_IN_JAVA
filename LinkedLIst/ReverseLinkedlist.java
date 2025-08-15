package LinkedLIst;

public class ReverseLinkedlist {
    public static class Node{
        int data;
        Node next;

    }

    public static class linkedlist{
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
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;


            }
            System.out.println();
        }
        private Node getNodeAt(int idx){
            Node temp=head;
            for (int i = 0; i < idx; i++) {
                temp=temp.next;

            }
            return temp;
        }
        public void reverse(){
            int li=0;
            int ri=size-1;
            while(li<ri){
                Node left=getNodeAt(li);
                Node right=getNodeAt(ri);

                int temp= left.data;
                left.data=right.data;
                right.data=temp;
                li++;
                ri--;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addLast(12);
        ll.addLast(56);
        ll.addLast(90);
        ll.addLast(6);
        ll.display();
        ll.reverse();
        ll.display();
    }
}

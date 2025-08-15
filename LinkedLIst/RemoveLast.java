package LinkedLIst;

public class RemoveLast {
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
        void removeLast(){
            if(size==0){
                System.out.println("linkedlist is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                Node temp=head;
                for (int i = 0; i <size-2 ; i++) {
                    temp=temp.next;

                }
                tail=temp;
                temp.next=null;
                size--;
            }

        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addLast(23);
        ll.addLast(45);
        ll.addLast(1);
        ll.addLast(47);
        ll.display();
        ll.removeLast();
        ll.display();
    }
}

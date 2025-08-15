public class Main{
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
        int size(){
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
        public void remove(){
            if(size==0){
                System.out.println("linkedlist is empty");

            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                head=head.next;
                size--;
            }
        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(34);
        ll.addLast(19);
        ll.display();
        ll.remove();
        ll.display();
        ll.remove();
        ll.display();
    }
}
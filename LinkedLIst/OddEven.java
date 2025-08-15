package LinkedLIst;

public class OddEven {
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
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;

        }
        public int size(){
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
        public int getFirst() {
            if (size == 0) {
                System.out.println("linked list is empty");
                return -1;
            } else {
                return head.data;
            }
        }
        public void removeFirst(){
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
        public void oddEven(){
            linkedlist odd=new linkedlist();
            linkedlist even=new linkedlist();

            while(this.size>0){
                int val=this.getFirst();
                this.removeFirst();

                if(val%2==0){
                    even.addLast(val);
                }
                else{
                    odd.addLast(val);
                }

            }
            if(odd.size>0&&even.size>0){
                odd.tail.next= even.head;
                this.head=odd.head;
                this.tail=even.tail;
                this.size=odd.size+even.size;
            }
            else if(odd.size>0){
                this.head=odd.head;
                this.tail=odd.tail;
                this.size=odd.size;
            }
            else if(even.size>0){
                this.head=even.head;
                this.tail=even.tail;
                this.size=even.size;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addLast(2);
        ll.addLast(7);
        ll.addLast(9);
        ll.addLast(6);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(12);
        ll.addLast(3);
        ll.display();
        ll.oddEven();
        ll.display();
    }
}

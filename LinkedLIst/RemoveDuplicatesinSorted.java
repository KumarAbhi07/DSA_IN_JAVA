package LinkedLIst;

public class RemoveDuplicatesinSorted {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList {
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
        int size(){
            return size;
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
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public void removeDuplicate(){
            LinkedList res=new LinkedList();

            while(this.size()>0){
                int val=this.getFirst();
                this.removeFirst();

                if(res.size()==0|| res.tail.data!=val){
                    res.addLast(val);
                }
            }
            this.head=res.head;
            this.tail=res.tail;
            this.size=res.size;
        }


    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(5);
        ll.addLast(5);
        ll.addLast(5);

        ll.display();
        ll.removeDuplicate();
        ll.display();



    }
}

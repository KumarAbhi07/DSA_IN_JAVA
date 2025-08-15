package LinkedLIst;

public class Revesealinkedlistusingdatarecursive {
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
        public void reverseDRhelper(Node right,int floor) {
            if (right == null) {
                return;
            }
            reverseDRhelper(right.next, floor + 1);

            if (floor >= size / 2) {
                int temp = right.data;
                right.data = rleft.data;
                rleft.data = temp;

                rleft = rleft.next;
            }
        }
        Node rleft;
        public void reverseDR(){
            rleft=head;
            reverseDRhelper(head,0);


            }
        }

    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.addLast(10);
        ll.addLast(12);
        ll.addLast(14);
        ll.addLast(34);
        ll.addLast(45);
        ll.display();
        ll.reverseDR();
        ll.display();
    }

    }



package LinkedLIst;


public class Intersectionpoint {
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
    public static int findintersection(Linkedlist one , Linkedlist two){
        Node t1 = one.head;
        Node t2=two.head;

        int delta=Math.abs(one.size-two.size);
        if(one.size>two.size){
            for (int i = 0; i < delta; i++) {
                t1=t1.next;

            }
        }else{
            for (int i = 0; i <delta ; i++) {
                t2=t2.next;

            }
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1.data;
        }
    }

    public static void main(String[] args) {
        Linkedlist l1=new Linkedlist();
        Linkedlist l2=new Linkedlist();

        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.addLast(7);
        l2.addLast(90);
        l2.addLast(9);
        l2.addLast(906);
        l2.addLast(4);
        l2.addLast(5);
        int intersection=Linkedlist.findintersection(l1,l2);
        System.out.println(intersection);
    }

}

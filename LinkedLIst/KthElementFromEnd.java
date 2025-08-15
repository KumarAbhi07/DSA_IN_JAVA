package LinkedLIst;

public class KthElementFromEnd {
    public static class  Node {
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


        int kthfromlast(int k) {

            Node s = head;
            Node f = head;

            for (int i = 0; i < k; i++) {
                f = f.next;

            }

            while (f != tail) {
                s = s.next;
                f = f.next;
            }
            return s.data;
        }
    }
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addLast(34);
        list.addLast(56);
        list.addLast(90);
        list.addLast(34);
        list.addLast(56);
        list.addLast(45);
        System.out.println(list.kthfromlast(4));
    }
}

package LinkedLIst;

public class AddTwoLinkedList {
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
        void addFirst(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            if(size==0){
                tail=temp;
            }
            size++;
        }

        public static int addListHelper(Node one, int pv1, Node two, int pv2,Linkedlist res) {
        if (one == null && two == null) {
            return 0;
        }
        int data=0;
        if (pv1 > pv2) {
            int oc=addListHelper(one.next, pv1 - 1, two, pv2,res);
            data=one.data+oc;
        } else if (pv1 < pv2) {
            int oc=addListHelper(one, pv1, two.next, pv2 - 1,res);
            data=two.data + oc;
        } else {
            int oc = addListHelper(one.next, pv1 - 1, two.next, pv2 - 1,res);
            data = one.data + two.data + oc;
        }

        int nd = data % 10;
        int nc = data / 10;

        res.addFirst(nd);
        return nc;
    }
    public static Linkedlist addTwoLists(Linkedlist one,Linkedlist two){
        Linkedlist res = new Linkedlist();
        int oc =addListHelper(one.head,one.size,two.head,two.size,res);
        if(oc>0){
            res.addFirst(oc);
        }
        return res;
        }
    }

    public static void main(String[] args) {

        Linkedlist l1=new Linkedlist();
        Linkedlist l2= new Linkedlist();
        l1.addLast(9);
        l1.addLast(9);
        l1.addLast(8);
        l1.addLast(9);
        l2.addLast(1);
        l2.addLast(1);
        Linkedlist.addTwoLists(l1,l2 ).display();


    }
    }



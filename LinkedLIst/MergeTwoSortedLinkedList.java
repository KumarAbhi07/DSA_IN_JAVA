package LinkedLIst;

public class MergeTwoSortedLinkedList {
    public static class Node{
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
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public static linkedlist mergetwosorted(linkedlist l1,linkedlist l2){
            Node one=l1.head;
            Node two=l2.head;

            linkedlist ll=new linkedlist();
            while(one!=null&&two!=null){
                if(one.data<two.data){
                    ll.addLast(one.data);
                    one=one.next;
                }
                else{
                    ll.addLast(two.data);
                    two=two.next;
                }

            }

            while(one!=null){
                ll.addLast(one.data);
                one=one.next;
            }
            while(two!=null){
                ll.addLast(two.data);
                two=two.next;
            }
            return ll;
        }
    }

    public static void main(String[] args) {

        linkedlist l1=new linkedlist();
        linkedlist l2=new linkedlist();
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(40);
        l1.addLast(50);
        l2.addLast(7);
        l2.addLast(9);
        l2.addLast(12);
        l2.addLast(15);
        l2.addLast(37);
        l2.addLast(43);
        l2.addLast(44);
        l2.addLast(45);
        l2.addLast(52);
        l2.addLast(56);
        l1.display();
        l2.display();
        linkedlist res=linkedlist.mergetwosorted(l1,l2);
        res.display();
    }
}

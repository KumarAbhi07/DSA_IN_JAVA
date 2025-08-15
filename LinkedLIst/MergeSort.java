package LinkedLIst;

public class MergeSort {
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

        public static Node midNode(Node head,Node tail){
            Node s=head;
            Node f=tail;

            while(f!=tail && f.next!=tail){
                f=f.next.next;
                s=s.next;
            }
            return s;
        }

        public static linkedlist mergetwosorted(linkedlist l1,linkedlist l2){
            Node one=l1.head;
            Node two=l2.head;

            linkedlist ll=new linkedlist();
            while(one!=null && two!=null){
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

        public static linkedlist mergeSort(Node head, Node tail){
            if(head==tail){
                linkedlist br=new linkedlist();
                br.addLast(head.data);
                return br;
            }

            Node mid=midNode(head,tail);
            linkedlist fsh=mergeSort(head,mid);
            linkedlist ssh=mergeSort(mid.next,tail);
            linkedlist c1=linkedlist.mergetwosorted(fsh,ssh);
            return c1;
        }
    }

        public static void main(String[] args) {
            linkedlist ll=new linkedlist();

            ll.addLast(10);
            ll.addLast(24);
            ll.addLast(30);
            ll.addLast(40);
            ll.addLast(50);
            ll.addLast(7);
            ll.addLast(9);
            ll.addLast(12);
            ll.addLast(15);
            ll.addLast(37);
            ll.addLast(43);
            ll.addLast(44);
            ll.addLast(45);
            ll.addLast(52);
            ll.addLast(56);
            ll.addLast(0);
            ll.addLast(1);
            ll.addLast(8);
            ll.addLast(7);
            ll.display();
            linkedlist sorted=linkedlist.mergeSort(ll.head,ll.tail);
            sorted.display();

        }
}

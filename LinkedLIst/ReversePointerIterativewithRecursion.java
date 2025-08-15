package LinkedLIst;

public class ReversePointerIterativewithRecursion {
    public static class Node{
        int data;
        Node next;
    }
    public static class linkedlist {
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

        private void reversePRhelper(Node node){
            if(node==null){
                return;
            }
            reversePRhelper(node.next);
            if(node==tail){
                //do nothing
            }
            else{
                node.next.next=node;
            }

        }

        public void reversePR(){
            reversePRhelper(head);
            head.next=null;
            Node temp=head;
            head=tail;
            tail=temp;
        }

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        linkedlist ll =new linkedlist();

        ll.addLast(11);
        ll.addLast(12);
        ll.addLast(30);
        ll.addLast(676);
        ll.addLast(90);


        ll.reversePR();
        ll.display();

    }
}


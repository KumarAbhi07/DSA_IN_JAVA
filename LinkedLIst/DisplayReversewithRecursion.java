package LinkedLIst;

public class DisplayReversewithRecursion {
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


        private void displayreversehelper(Node node) {
            if(node==null){
                return;
            }
            displayreversehelper(node.next);
            System.out.print(node.data+" ");
        }
        public void displayReverse(){
            displayreversehelper(head);
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

        ll.displayReverse();

    }

}

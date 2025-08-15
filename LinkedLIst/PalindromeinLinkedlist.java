package LinkedLIst;

public class PalindromeinLinkedlist {
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
        private boolean IsPalindromeHelper(Node right) {
            if (right == null) {
                return true;
            }
            boolean rres = IsPalindromeHelper(right.next);
            if (rres == false) {
                return false;
            } else if (pleft.data != right.data) {
                return false;
            } else {
                pleft = pleft.next;
                return true;
            }


        }
        Node pleft;
        public boolean Ispalindrome(){
            pleft=head;
            return IsPalindromeHelper(head);
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addLast(10);
        ll.addLast(30);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(10);
        ll.display();
        System.out.println(ll.Ispalindrome());
    }
}

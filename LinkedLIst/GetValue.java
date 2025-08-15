package LinkedLIst;

public class GetValue {
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
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int size(){
            return size;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public int GetFirst(){
            if(size==0){
                System.out.println("linked list is empty");
                return -1;
            }
            else{
                return head.data;
            }
        }public int GetLast(){
            if(size==0){
                System.out.println("linkedlist is empty");
                return -1;
            }
            else{
                return tail.data;
            }
        }
        public int Get(int idx){
            if(size==0){
                System.out.println("linkedlist is empty");
                return -1;
            } else if (idx<0||idx>=size) {
                System.out.println("Invaild Arguments!");
                return -1;
          } else{
                Node temp=head;
                for (int i = 0; i < idx; i++) {
                    temp=temp.next;
                }
               return temp.data;
        }
}

     }

    public static void main(String[] args) {
            linkedlist ll=new linkedlist();
            ll.addLast(12);
            ll.addLast(45);
        ll.addLast(1);
        ll.addLast(5);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(16);
        ll.addLast(78);
        ll.addLast(8);
        ll.addLast(90);
        System.out.println(ll.GetLast());
        System.out.println(ll.GetFirst());
        System.out.println(ll.Get(7));
    }
}

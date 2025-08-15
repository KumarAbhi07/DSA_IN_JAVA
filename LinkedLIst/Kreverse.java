package LinkedLIst;

public class Kreverse {
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
        public int getFirst(){
            if(size==0){
                System.out.println("linked list is empty");
                return -1;
            }
            else{
                return head.data;
            }
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
            System.out.println();
        }
        public void removeFirst(){
            if(size==0){
                System.out.println("linkedlist is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                head=head.next;
                size--;
            }
        }
        public void kreverse(int k){
            linkedlist prev=null;
            while(this.size>0){
                linkedlist curr=new linkedlist();
                if(this.size>=k){
                    for (int i = 0; i < k; i++) {
                        int val=this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val);
                    }
                    
                }
                else{
                    int os=this.size();
                    for (int i = 0; i <os ; i++) {
                        int val=this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);
                    }

                }
                if(prev==null){
                    prev=curr;
                }
                else{
                    prev.tail.next=curr.head;
                    prev.tail=curr.tail;
                    prev.size+=curr.size;
                }
            }
            this.head=prev.head;
            this.tail=prev.tail;
            this.size=prev.size;

        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.addLast(11);
        ll.display();
        ll.kreverse(3);
        ll.display();
    }


}

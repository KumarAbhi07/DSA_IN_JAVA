package LinkedLIst;

public class removeAtidx {
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
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void removefirst(){
            if(size==0){
                System.out.println("Linkedlist is empty");
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
        void removelast(){
            if(size==0){
                System.out.println("Linkedlist is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                Node temp=head;
                for(int i=0;i<size-2;i++){
                    temp=temp.next;

                }
                tail=temp;
                tail.next=null;
                size--;
            }
        }
        void removeAt(int idx){
            if(idx<0||idx>=size){
                System.out.println("Invaild Arguments");
            }
            else if(idx==0){
                removefirst();
            }
            else if (idx==size-1){
                removelast();
            }
            else{
                Node temp=head;
                for (int i = 0; i < idx-1 ; i++) {
                    temp=temp.next;

                }
                temp.next=temp.next.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addLast(12);
        ll.addLast(23);
        ll.addLast(3);
        ll.addLast(45);
        ll.addLast(56);
        ll.display();
        ll.removeAt(3);
        ll.display();
    }
}

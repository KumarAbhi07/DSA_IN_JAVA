package LinkedLIst;

public class AddatIndex {
    public static class node{
        int  data;
        node next;
    }
    public static class linkedlist{
        node head;
        node tail;
        int size;
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
           return size;
        }
        void addLast(int val){
            node temp=new node() ;
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
        void addFirst(int val){
            node temp=new node();
            temp.data=val;
            temp.next=head;
            head=temp;
            if(size==0){
                tail=temp;
            }
            size++;
        }
        void AddAtIndex(int idx,int val){
            if(idx<0||idx>size){
                System.out.println("Invaild Argument");
            }
            else if(idx==0){
                addFirst(val);

            }
            else if(idx==size){
                addLast(val);
            }
            else{
                node node=new node();
                node.data=val;

                node temp=head;
                for (int i = 0; i <idx-1 ; i++) {
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;
            }
            size++;
        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addLast(12);
        ll.addLast(90);
        ll.addFirst(34);
        ll.addLast(80);
        ll.addFirst(56);
        ll.addFirst(59);
        ll.display();
        System.out.println(ll.size());
        ll.AddAtIndex(7,60);
        ll.display();
        System.out.println(ll.size());

    }
}

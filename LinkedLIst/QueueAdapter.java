package LinkedLIst;

import java.util.LinkedList;

public class QueueAdapter {
    public static class queuemethods{
        LinkedList<Integer> list=new LinkedList<>();
        int size(){
            return list.size();
        }
        void add(int val){
            list.addLast(val);
        }
        int  remove(){
            if(size()==0){
                System.out.println("queue is underflow");
                return -1;
            }
            else{
                return list.removeFirst();
            }
        }
        int peek(){
            if(size()==0){
                System.out.println("queue is underflow");
                return -1;
            }
            else{
                return list.getFirst();
            }
        }
    }

    public static void main(String[] args) {
        queuemethods queue=new queuemethods();
        queue.add(34);
        queue.add(12);
        queue.add(68);
        queue.add(28);
        queue.add(38);
        System.out.println(queue.list);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue.list);
    }
}

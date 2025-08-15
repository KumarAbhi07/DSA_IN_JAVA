package LinkedLIst;
import java.util.LinkedList;

public class StackAdapter {
   public static class stackmethods {
      LinkedList<Integer> list = new LinkedList<>();


      int size() {
         return list.size();
      }

      void push(int val) {
         list.addFirst(val);
      }

      int pop() {
         if (size() == 0) {
            System.out.println("Stack is underflow");
            return -1;

         } else {
            return list.removeFirst();
         }
      }

      int top() {
         if (size() == 0) {
            System.out.println("stack");
            return -1;
         } else {
            return list.getFirst();
         }
      }


   }

   public static void main(String[] args) {
         stackmethods stack=new stackmethods();
         stack.push(40);
         stack.push(45);
         stack.push(590);
         stack.push(7);
         System.out.println(stack.list);
         System.out.println(stack.size());
         System.out.println(stack.top());
         stack.pop();
         System.out.println(stack.list);

         System.out.println(stack.top());

   }
}

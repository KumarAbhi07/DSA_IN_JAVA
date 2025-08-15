package LinkedLIst;

public class FoldLinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class Linkedlist {
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

        public int size() {
            return size;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        private void foldHelper(Node right, int floor) {
            if (right == null) {
                return;
            }
            foldHelper(right.next, floor + 1);
            if (floor > size / 2) {
                Node temp = fleft.next;
                fleft.next = right;
                right.next = temp;
                fleft = temp;
            } else if (floor == size / 2) {
                tail = right;
                tail.next = null;
            }
        }

        Node fleft;

        public void fold() {
            fleft = head;
            foldHelper(head, 0);
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.display();
        ll.fold();
        ll.display();
    }

}

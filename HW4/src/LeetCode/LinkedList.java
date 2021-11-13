package LeetCode;

public class LinkedList {
    private Node node;
    private static Object obj;

    public LinkedList(){
        node = new Node(0);
        obj = new Object();
    }

    public void addAtPosition(int index, int element){
        synchronized (obj) {
            // base case out of range
            if (index > this.size() - 1 && index < 0){
                System.out.println("Index out of range, Please make sure index is in [0," + (this.size() - 1) + "]");
            }
            Node head = node;
            Node pre = new Node(0);
            int idx = 0;
            while (head != null) {
                if (idx == index) {
                    if (idx > 0) {
                        Node dummy = new Node(element);
                        dummy.next = head;
                        pre.next = dummy;
                    } else if (idx == 0) {
                        Node dummy = new Node(element);
                        dummy.next = head;
                        node = dummy;
                    }
                    break;
                }
                idx++;
                pre = head;
                head = head.next;
            }
        }
    }
    public void removeAtPosition(int index){
        synchronized (obj) {
            Node head = node;
            Node pre = new Node(0);
            int idx = 0;
            while (head != null) {
                if (idx == index) {
                    if (idx > 0) {
                        pre.next = head.next;
                    } else if (idx == 0) {
                        node = node.next;
                    }
                    break;
                }
                idx++;
                pre = head;
                head = head.next;
            }
            System.out.println("Thread name = " + Thread.currentThread().getName() +  " List Size = " + this.size() + " Index = " + index);
        }
    }
    public int getFirst() {
        synchronized (obj) {
            return node.val;
        }
    }
    public int getLast() {
        synchronized (obj) {
            Node head = node;
            while (head.next.next != null) {
                head = head.next;
            }
            return head.val;
        }
    }
    public int size(){
        synchronized (obj) {
            Node head = node;
            int size = 0;
            while (head != null) {
                size++;
                head = head.next;
            }
            return size - 1;
        }
    }
    public void print(){
        synchronized (obj) {
            Node head = node;
            while (head.next != null) {
                System.out.println(head.val);
                head = head.next;
            }
        }
    }
    static class Node {
        int val;
        Node next;
        Node(int data){
            val = data;
            next = null;
        }
    }
}

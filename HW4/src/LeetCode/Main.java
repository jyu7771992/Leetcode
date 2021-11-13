package LeetCode;

public class Main {
    public static void main(String[] args) {
        LinkedList safelinkList = new LinkedList();
        safelinkList.addAtPosition(0,1);
        safelinkList.addAtPosition(0,2);
        safelinkList.addAtPosition(0,3);
        safelinkList.addAtPosition(7,4);
        System.out.println(safelinkList.getFirst());
        System.out.println(safelinkList.getLast());//!!
        System.out.println(safelinkList.size());
        safelinkList.print();
        System.out.println("------------");
        safelinkList.removeAtPosition(2);
        safelinkList.removeAtPosition(1);
        safelinkList.print();
        System.out.println("------------");
    }
}

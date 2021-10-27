package LeetCode.Q1;

public class Main {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Frankenstein", 20.00, "1993");
        NonFiction nonFiction = new NonFiction("Anne Fran", 10.0, "1990");
        System.out.println(fiction.toString());
        System.out.println(nonFiction.toString());
        fiction.setBorrowDate(5);
        fiction.setReturnDate(10);
        System.out.println(fiction.description());
        System.out.println(nonFiction.description());
        nonFiction.setBorrowDate(9);
        nonFiction.setReturnDate(15);
        System.out.println(fiction.isAvailable(3));
        System.out.println(nonFiction.isAvailable(1));
    }
}

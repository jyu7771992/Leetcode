package LeetCode.Q2;

public class Main {
    public static void main(String[] args) {
        Printer db = Printer.get_instance();
        System.out.println( db.getConnection() );
    }
}

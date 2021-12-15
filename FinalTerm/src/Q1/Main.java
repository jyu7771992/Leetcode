package Q1;

public class Main {
    public static Object Direction;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public static void main(String[] args) {
	// write your code here
        int [][] room = {
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0}
        };
        Roomba roomba = new Roomba(room);
        System.out.println(roomba.move());
        System.out.println(roomba.move());
        roomba.turnRight();
        System.out.println(roomba.move());
        roomba.turnLeft();
        System.out.println(roomba.move());
    }
}
//return false when out of bound
//Minimum Remove to Make Valid Parentheses

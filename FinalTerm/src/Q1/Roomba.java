package Q1;

public class Roomba implements iRobot {

    int[][] room;
    Main.Direction dir;

    public Roomba(int[][] room) {
        this.room = room;
        dir = (Main.Direction) Main.Direction;
    }

    @Override
    public boolean move(int[][] room) {
        return false;
    }

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public void turnLeft() {
//        for(int i=col_start;i<=col_end;i++)
//        {
//            list.add(matrix[row_start][i]);//transverse that row
//            //left to right
//        }
//        row_start++;
    }

    @Override
    public void turnRight() {

    }

    @Override
    public void clean() {

    }


};

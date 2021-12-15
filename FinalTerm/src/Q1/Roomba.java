package Q1;

import com.sun.javafx.scene.traversal.Direction;
import java.util.HashMap;
import java.util.Map;

public class Roomba implements iRobot {

    int[][] room;
    Direction currentDirection;
    Position currentPosition;
    Map<Direction, int[]> direction;
    public Roomba(int[][] room) {
        this.room = room;
        currentDirection = Direction.DOWN;
        currentPosition = new Position(0, 0);

        direction = new HashMap<>();
        direction.put(Direction.DOWN, new int[]{1, 0});
        direction.put(Direction.UP, new int[]{-1, 0});
        direction.put(Direction.RIGHT, new int[]{0, 1});
        direction.put(Direction.LEFT, new int[]{0, -1});
    }


    @Override
    public boolean move() {
        int rows = room.length;
        int cols = room[0].length;

        int[] moveto = direction.get(currentDirection);
        int curRow = currentPosition.row;
        int curCol = currentPosition.col;

        int nextRow = curRow + moveto[0];
        int nextCol = curCol + moveto[1];

        if(nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols){
            return false;
        }
        if(room[nextRow][nextCol] == -1){
            return false;
        }
        currentPosition.row = nextRow;
        currentPosition.col = nextCol;

        return true;
    }

    @Override
    public void turnLeft() {
        if(currentDirection == Direction.DOWN){
            currentDirection = Direction.RIGHT;
        } else if(currentDirection == Direction.RIGHT){
            currentDirection = Direction.UP;
        }else if(currentDirection == Direction.UP){
            currentDirection = Direction.LEFT;
        } else {
            currentDirection = Direction.DOWN;
        }
    }

    @Override
    public boolean turnRight() {
        if(currentDirection == Direction.DOWN){
            currentDirection = Direction.LEFT;
        } else if(currentDirection == Direction.LEFT){
            currentDirection = Direction.UP;
        }else if(currentDirection == Direction.UP){
            currentDirection = Direction.RIGHT;
        } else {
            currentDirection = Direction.DOWN;
        }
        return false;
    }

    @Override
    public void clean() {
        room[currentPosition.row][currentPosition.col] = 0;
    }
};

class Position{
    int row;
    int col;
    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }
}

package LeetCode;

import java.util.ArrayList;

public class Q5 {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();

        if(matrix.length==0)
            return list;

        int row_start=0, row_end=matrix.length-1;
        int col_start=0, col_end=matrix[0].length-1;

        while(row_start<=row_end && col_start<=col_end)
        {
            for(int i=col_start;i<=col_end;i++)
            {
                list.add(matrix[row_start][i]);//transverse that row
                //left to right
            }
            row_start++;

            for(int i=row_start;i<=row_end;i++)
            {
                list.add(matrix[i][col_end]);//tranverse that column
                //downward
            }
            col_end--;

            if(row_start <= row_end)
            {
                for(int i=col_end;i>=col_start;i--)
                {
                    list.add(matrix[row_end][i]);//transverse that row
                    //right to left
                }
            }
            row_end--;

            if(col_start<=col_end)
            {
                for(int i=row_end;i>=row_start;i--)
                {
                    list.add(matrix[i][col_start]);//transverse that column
                    //upward
                }
            }
            col_start++;

        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        int[][] matrix_ex1 = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < spiralOrder(matrix_ex1).size();i++){
            System.out.println(spiralOrder(matrix_ex1).get(i));
        }
        System.out.println("---------(Example 2)-----------");
        int[][] matrix_ex2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i = 0; i < spiralOrder(matrix_ex2).size();i++){
            System.out.println(spiralOrder(matrix_ex2).get(i));
        }
    }
}

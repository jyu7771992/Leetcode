package LeetCode;

public class Q1 {
    public static int[][] transpose(int[][] matrix) {
        int col = matrix.length, row = matrix[0].length;
        int colcount = 0;
        int[][] result = new int[row][col];
        for(int[] i : matrix){
            for(int j =0;j<i.length;j++){
                result[j][colcount] = i[j];
            }
            colcount++;
        }
        return result;
    }
    public static void print(int[][] matrix){
        int col = matrix.length, row = matrix[0].length;
        for (int i = 0; i < col; i++) {
            String output = "";
            for (int j = 0; j < row; j++) {
                output += (matrix[i][j] + " | ");
            }
            System.out.println(output);
        }
    }
    public static void main(String[] args) {
        System.out.println("__________(Example_One)_________________");
        int[][] matrix_ex1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The Original matrix:");
        print(matrix_ex1);
        System.out.println("The transposable one:");
        print(transpose(matrix_ex1));
        System.out.println("__________(Example_Two)_________________");
        int[][] matrix_ex2 = {{1,2,3},{4,5,6}};
        System.out.println("The Original matrix:");
        print(matrix_ex2);
        System.out.println("The transposable one:");
        print(transpose(matrix_ex2));
    }

}

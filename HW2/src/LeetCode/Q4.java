package LeetCode;

public class Q4 {
    public static void rotate(int[][] matrix) {
        int [][] arr=new int[matrix.length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            int k=0;
            for(int j=matrix[i].length-1; j>=0; j--){
                arr[i][k]=matrix[j][i];
                k++;
            }
        }

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = arr[i][j];
            }
        }
    }
    public static void print(int[][] matrix) {
        int A = matrix.length, B=matrix[0].length;
        for(int i=0; i< A; i++){
            String output = "";
            for(int j=0; j< B; j++){
                output += (matrix[i][j] + " | ");
            }
            System.out.println(output);
        }
    }
    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        int[][] matrix_ex1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The original one");
        print(matrix_ex1);
        System.out.println("The rotate one");
        rotate(matrix_ex1);
        System.out.println("---------(Example 2)-----------");
        int[][] matrix_ex2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("The original one");
        print(matrix_ex2);
        System.out.println("The rotate one");
        rotate(matrix_ex2);
    }
}

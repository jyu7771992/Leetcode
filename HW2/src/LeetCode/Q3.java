package LeetCode;

public class Q3 {
    public static void moveZeroes(int[] nums) {

        for(int i = 0, j = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                swap(nums, i, j++);
            }
        }

    }
    public static void swap( int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void print(int[] nums){
        String output = "";
        for(int i=0; i< nums.length; i++){
            output += nums[i] + " | ";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        int[] nums1 = {0,1,0,3,12};
        print(nums1);
        moveZeroes(nums1);
        print(nums1);
        System.out.println("---------(Example 2)-----------");
        int[] nums2 = {0};
        print(nums2);
        moveZeroes(nums2);
        print(nums2);

    }
}

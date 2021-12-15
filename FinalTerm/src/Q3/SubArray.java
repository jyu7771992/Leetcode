package Q3;

import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> subArraySums = new HashMap<>();//create hasmap to store key and value
            subArraySums.put(0, 1);
            int sum = 0;
            int rescount = 0;

            for (int i : nums) { // interate nums
                sum = sum + i; // sum = sum + i
                rescount += subArraySums.getOrDefault(sum - k, 0);
                subArraySums.merge(sum, 1, (val1, val2) -> val1 + val2);
            }

            return rescount;
        }
    public static void main(String[] args) {
        System.out.println("------------testcase1------------");
        int[] nums1 = {1,1,1};
        int k1 = 2;
        System.out.println(subarraySum(nums1, k1));

        System.out.println("------------testcase2------------");
        int[] nums2 = {1,2,3};
        int k2 = 3;
        System.out.println(subarraySum(nums2, k2));
    }
}

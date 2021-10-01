import java.util.*;
public class Main {
    //questions1:
    public static void main(String[] args){
        //Question 1: examples
        int[] testQ1 = {1,2,3,2};
        int[] testQ2= {1,1,1,1,1};
        int[] testQ3= {1,2,3,4,5};
        System.out.println(Question1(testQ1));
        System.out.println(Question1(testQ2));
        System.out.println(Question1(testQ3));

        //Question 2:  examples
        int[] Q2_test1 = {-4,-1,0,3,10};
        int[] Q2_test2= {-7,-3,2,3,11};
        System.out.println(Question2(Q2_test1));
        System.out.println(Question2(Q2_test2));

        //Question 3: examples
        int[] Q3_test1 = {2,3,4,2,2,3,5,7};
        System.out.println(Questions3(Q3_test1));

        //Question 4: examples
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(Question4(ransomNote,magazine));

        //Question 4: examples
        String Q5_str1 = "1A3d4s5t";
        String Q5_str2 = "A2bb2d4";
        System.out.println(Question5(Q5_str1));
        System.out.println(Question5(Q5_str2));
    }

    //Question1 solution
    public static int Question1(int[] nums) {
        int sum = 0;
        int[] arr = new int[101];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]] ++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
    //Question2 solution
    public static int square(int num){
        return num * num;
    }
    public static int[] Question2(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for(int j = nums.length - 1; j>=0; j--){
            if(square(nums[right]) < square(nums[left])){
                result[j] = square(nums[left++]);
            } else {
                result[j] = square(nums[right--]);
            }
        }
        return result;
    }
    //Question3 solution
    public static int Questions3 (int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int num = arr.length;
        for(int i = 0; i < num; i++){
            Integer times = map.get(arr[i]);
            map.put(arr[i], (times == null) ? 1 : times + 1);
        }
        for (int j = 0; j < num; j++){
            if(map.get(arr[j])==1) return arr[j];

        }
        return -1;
    }

    //Question4 solution
    public static boolean Question4(String ransomNote, String magazine) {
        int r = ransomNote.length();
        int m = magazine.length();
        if(r > m){
            return false;
        }
        int[] arr = new int[26];

        for(char ch : magazine.toCharArray()) {
            arr[ch - 'a']++;
        }

        for(char ch : ransomNote.toCharArray()) {
            if(arr[ch - 'a'] == 0)
                return false;
            arr[ch - 'a']--;
        }
        return true;
    }
    //Question5 solution
    public static boolean Question5(String str){
        boolean checkStatus = false;
        for(int i = 0; i < str.length(); i++){
            String current = String.valueOf(str.charAt(i));
            boolean number = isCurrent(current);
            if(!number){
                if (!checkStatus) return false;
                checkStatus = false;
            } else{
                if(checkStatus) return false;
                checkStatus = true;
            }
        }
        return true;
    }
    public static boolean isCurrent(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}

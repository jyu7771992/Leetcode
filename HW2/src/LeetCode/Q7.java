package LeetCode;

public class Q7 {
    public static String addStrings(String num1, String num2) {
        String ans = "";
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;

        while(i >= 0 || j >= 0 || carry != 0){
            int i_val= i>=0? num1.charAt(i)-'0':0;
            int j_val= j>=0? num2.charAt(j)-'0':0;
            i--; j--;
            int sum = i_val + j_val + carry;
            carry = sum/10;
            ans = sum % 10 + ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        System.out.println(addStrings("123","34"));
        System.out.println("---------(Example 2)-----------");
        System.out.println(addStrings("123","99"));
        System.out.println("---------(Example 3)-----------");
        System.out.println(addStrings("123222","999"));
    }
}

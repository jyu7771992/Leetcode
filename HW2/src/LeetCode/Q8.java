package LeetCode;

public class Q8 {
    public static boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }

        int j = s.length() - 1;
        int i = 0;
        while (i < j) {
            if (!isAlphaNumeric(s.charAt(j))) { j--; continue; }
            if (!isAlphaNumeric(s.charAt(i))) { i++; continue; }
            if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) return false;
        }
        return true;
    }

    public static boolean isAlphaNumeric(char char1) {
        return (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z') || (char1 >= '0' && char1 <= '9');
    }

    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("---------(Example 2)-----------");
        System.out.println(isPalindrome("Hello word! I am a master student"));
        System.out.println("---------(Example 3)-----------");
        System.out.println(isPalindrome("Today is a good for leetcode practice"));
    }
}

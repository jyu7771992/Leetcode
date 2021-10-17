package LeetCode;

public class Q9 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String reverseString = "";
        for(int i = 0; i < words.length;i++){
            if (!words[words.length-1-i].isEmpty()){
                reverseString += words[words.length-1-i].trim() + " ";
            }
        }
        return reverseString.trim();
    }
    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        System.out.println(reverseWords(" the sky is blue "));
        System.out.println("---------(Example 2)-----------");
        System.out.println(reverseWords("  hello world  "));
        System.out.println("---------(Example 3)-----------");
        System.out.println(reverseWords("a good   example"));
    }
}

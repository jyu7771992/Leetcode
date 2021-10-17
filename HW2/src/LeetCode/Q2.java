package LeetCode;

public class Q2 {
    public static int shortestDistance(String[] words, String word1, String word2) {
        int num1 = -1, num2 = -1, ans = Integer.MAX_VALUE;
        for (int i = 0; i< words.length; i++){
            String word = words[i];
            if(word.equals(word1)){
                num1 = i;
                if(num2 != -1){
                    ans = Math.min(ans, Math.abs(num1-num2));
                }
            }
            if(word.equals(word2)){
                num2 = i;
                if(num1 != -1){
                    ans = Math.min(ans, Math.abs(num1-num2));
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        String[] test1 = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(test1,"coding","practice"));
        System.out.println("---------(Example 2)-----------");
        String[] test2 = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(test2, "makes","coding"));
    }
}

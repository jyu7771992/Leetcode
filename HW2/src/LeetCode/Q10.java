package LeetCode;

public class Q10 {
    public static int compress(char[] chars) {
        int charLen = chars.length;
        if(charLen <= 1) return charLen;
        int i = 0, j = 1;
        while(i < charLen){
            int count = 1;
            char c = chars[i];
            while(i < charLen - 1 && chars[i] == chars[i + 1]){
                count++;
                i++;
            }
            chars[j - 1] = c;
            if(count > 1) {
                String num = String.valueOf(count);
                for(int k = 0; k < num.length(); k++){
                    chars[j] = num.charAt(k);
                    j++;
                }
            }
            j++;
            i++;
        }
        return j - 1;
    }
    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        char[] c1 = {'a','a','b','b','c','c','c'};
        System.out.println(compress(c1));
        System.out.println("--------");
        for(char c: c1){
            System.out.println(c);
        }
        System.out.println("---------(Example 2)-----------");
        char[] c2 = {'a','a','b','b','b','b','b','b','b','b','b','b','c','c','c'};
        System.out.println(compress(c2));
        System.out.println("--------");
        for(char c: c2){
            System.out.println(c);
        }
        System.out.println("---------(Example 3)-----------");
        char[] c3 = {'a','a','b','b','c','c','c','c','c','c','c','c','c','a'};
        System.out.println(compress(c3));
        System.out.println("--------");
        for(char c: c3){
            System.out.println(c);
        }
    }
}

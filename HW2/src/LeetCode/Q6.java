package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Q6 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        char x,y;
        for(int i=0; i<s.length(); i++){
            x = s.charAt(i);
            y = t.charAt(i);
            if(map1.containsKey(x)){
                if(y != map1.get(x)){
                    return false;
                }
            } else {
                map1.put(x,y);
            }

            if (map2.containsKey(y)){
                if(x != map2.get(y)){
                    return false;
                }
            } else {
                map2.put(y,x);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("---------(Example 1)-----------");
        System.out.println(isIsomorphic("egg","add"));
        System.out.println("---------(Example 2)-----------");
        System.out.println(isIsomorphic("eat","tss"));
        System.out.println("---------(Example 3)-----------");
        System.out.println(isIsomorphic("aas","add"));
    }
}

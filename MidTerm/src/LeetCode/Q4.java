package LeetCode;

import java.util.LinkedList;

public class Q4 {
    public static int lengthOfLongestSubstring(String s) {
        LinkedList<Character> list= new LinkedList<Character>();
        int ans = list.size();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!list.contains(c)){
                list.add(c);
            } else{
                helper(list,c);
                list.add(c);
            }
            ans=Math.max(ans,list.size());
        }
        return ans;
    }

    private static void helper(LinkedList<Character> list, char c){
        while(list.peek() != c){
            if(list.peek() == null)   return;
            list.poll();
        }
        list.poll();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("aaaaabcabcbb"));
        System.out.println(lengthOfLongestSubstring("ccccccc"));
        System.out.println(lengthOfLongestSubstring("b"));
    }
}

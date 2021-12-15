package Q2;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultArr = new ArrayList<List<String>>();
        Map <String,Integer> map = new HashMap<String,Integer>();
        //order the strs first
        Arrays.sort(strs);
        //interate the strs
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String strChar = new String(chars);
            //check if the value in string or not
            if(map.containsKey(strChar)){
                List list = resultArr.get(map.get(strChar)); // get the value in string
                list.add(str); // if exist then add the value to string
            } else{
                List list = new ArrayList();
                list.add(str);
                resultArr.add(list);
                map.put(strChar, resultArr.size()-1);
            }
        }
        return resultArr;
    }


    public static void main(String[] args) {
        // test cases for the solution
        String[] test1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(test1));
        String[] test2 = {""};
        System.out.println(groupAnagrams(test2));
        String[] test3 = {"a"};
        System.out.println(groupAnagrams(test3));
    }
}

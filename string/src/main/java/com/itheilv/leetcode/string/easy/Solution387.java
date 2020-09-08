package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-08
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class Solution387 {

    /*public static int firstUniqChar(String s) {
        Map<Character, Integer> resultMap = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char temp = s.charAt(i);
            resultMap.put(temp, resultMap.getOrDefault(temp, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (resultMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }*/

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            for (int j = 0; j < s.length(); ++j) {
                char c2 = s.charAt(j);
                if (c1 == c2 && i != j) {
                    break;
                } else if (j == s.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String param = "leetcode";
        int result = firstUniqChar(param);
        System.out.println(result);
    }

}

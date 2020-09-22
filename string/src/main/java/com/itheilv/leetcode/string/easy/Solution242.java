package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-22
 */
public class Solution242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //简易哈希表
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a'] += 1;
            map[t.charAt(i) - 'a'] -= 1;
        }

        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String param1 = "a";
        String param2 = "ab";
        final boolean result = isAnagram(param1, param2);
        System.out.println(result);
    }

}

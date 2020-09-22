package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-10
 */
public class Solution383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        //制作简易哈希表
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map[ransomNote.charAt(i) - 'a'] > 0) {
                map[ransomNote.charAt(i) - 'a'] -= 1;
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String param1 = "aab";
        String param2 = "ab";
        final boolean result = canConstruct(param1, param2);
        System.out.println(result);
    }
}

package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-08
 * 解题思路：对出现的大写字母进行统计
 * TODO 再次练习
 */
public class Solution520 {
    public static boolean detectCapitalUse(String word) {
        //对存在的大写字母进行判断
        char[] chars = word.toCharArray();
        int count = 0;
        for (char charTemp : chars) {
            if (charTemp >= 'A' && charTemp <= 'Z') {
                count++;
            }
        }
        return count == 0 || count == word.length() || (count == 1 && chars[0] >= 'A' && chars[0] <= 'Z');
    }

    public static void main(String[] args) {
        boolean flag = detectCapitalUse("acd");
        System.out.println(flag);
    }
}

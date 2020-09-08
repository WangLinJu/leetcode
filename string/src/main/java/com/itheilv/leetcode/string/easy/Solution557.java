package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-08
 * 557. 反转字符串中的单词 III
 */
public class Solution557 {

    public static String reverseWords(String s) {
        String[] result = s.split(" ");
        for (int i = 0; i < result.length; i++) {
            int left = 0;
            int right = result[i].length() - 1;

        }
        return "";
    }

    public static void main(String[] args) {
        String param = "Let's take LeetCode contest";
        String result = reverseWords(param);
        System.out.println(result);
    }
}

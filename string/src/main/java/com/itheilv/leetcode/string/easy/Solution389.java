package com.itheilv.leetcode.string.easy;


/**
 * @author WSQ
 * @since 2020-09-10
 * //TODO 熟悉位运算符的使用
 */
public class Solution389 {

    public static char findTheDifference(String s, String t) {
        char res = 0;
        int lens = s.length();
        for (int i = 0; i < lens; i++) {
            res ^= s.charAt(i) ^ t.charAt(i);
        }
        res ^= t.charAt(lens);
        return res;
    }

    public static void main(String[] args) {
        char result = findTheDifference("abcd", "badc1");
        System.out.println(result);
    }
}

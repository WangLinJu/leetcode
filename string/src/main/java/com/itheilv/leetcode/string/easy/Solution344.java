package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-08
 * 反转字符串->双指针法
 */
public class Solution344 {

    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o', 'z'};
        char[] result = reverseString(chars);
        System.out.println(result);
    }

}

package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-08
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 回文常见的三种做法：双指针，栈，reverse
 * //TODO 再练习
 */
public class Solution125 {
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        if (s.isEmpty()) {
            return true;
        }
        //去掉特殊字符，将第一个字符和最后一个字符对比
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
                continue;
            }

            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("aea");
        System.out.println(result);
    }
}

package com.itheilv.leetcode.total.one;

/**
 * @author WSQ
 * @since 2020-09-10
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * TODO 有更优解
 */
public class Solution09 {

    /**
     * 双指针法，不符合题目规范
     *
     * @param x param
     * @return the boolean
     */
    public static boolean isPalindrome01(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int left = 0;
        int right = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (left < right && chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static boolean isPalindrome02(int x) {
        int temp = x;
        int result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result == temp;
    }

    public static void main(String[] args) {
        int param = 121;
        boolean result = isPalindrome02(param);
        System.out.println(result);
    }
}

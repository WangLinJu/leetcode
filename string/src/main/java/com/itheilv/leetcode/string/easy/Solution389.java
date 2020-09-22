package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-10
 */
public class Solution389 {

    public static char findTheDifference01(String s, String t) {
        return (char) Math.abs(sumChar(s) - sumChar(t));
    }

    public static int sumChar(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (int) c;
        }
        return sum;
    }

    public static char findTheDifference02(String s, String t) {
        char temp = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            temp ^= s.charAt(i);
            temp ^= t.charAt(i);
        }
        return temp;
    }

    public static char findTheDifference03(String s, String t) {
        int n = s.length();
        char ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= s.charAt(i);
            ans ^= t.charAt(i);
        }
        ans ^= t.charAt(n);
        return ans;
    }


    public static void main(String[] args) {
        char result = findTheDifference03("abcd", "abcde");
        System.out.println(result);
    }
}

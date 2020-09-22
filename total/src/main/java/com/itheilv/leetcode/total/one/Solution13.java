package com.itheilv.leetcode.total.one;

/**
 * @author WSQ
 * @since 2020-09-10
 * 13. 罗马数字转整数
 */
public class Solution13 {

    public static int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

        }
        return sum;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String param = "MCMXCIV";
        int result = romanToInt(param);
        System.out.println(result);
    }
}

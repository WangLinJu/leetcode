package com.itheilv.leetcode.offer;

/**
 * @author WSQ
 * @since 2020-09-18
 */
public class Solution05 {

    public static String replaceSpace01(String s) {
        return s.replaceAll(" ", "%20");
    }

    public static String replaceSpace02(String s) {
        final char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (Character c : chars) {
            if (c == ' ') {
                builder.append("%20");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static String replaceSpace03(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                builder.append("%20");
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String param = " ";
        final String result = replaceSpace03(param);
        System.out.println(result);
    }
}

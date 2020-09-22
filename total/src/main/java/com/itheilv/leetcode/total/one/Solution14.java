package com.itheilv.leetcode.total.one;

/**
 * @author WSQ
 * @since 2020-09-10
 * 14. 最长公共前缀(只针对前缀)
 */
public class Solution14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < result.length() && j < strs[i].length(); j++) {
                if (result.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            result = result.substring(0, j);
            if ("".equals(result)) {
                return "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] param = new String[]{"fl", "flo"};
        String result = longestCommonPrefix(param);
        System.out.println(result);
    }
}

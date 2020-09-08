package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-08
 * TODO 有其他写法
 */
public class Solution58 {
    public static int lengthOfLastWord(String s) {
        String trim = s.trim();
        if (trim.length() == 0) {
            return 0;
        }
        String[] split = trim.split("\\s+");
        return split[split.length - 1].length();
    }

    public static void main(String[] args) {
        String param = "";
        int result = lengthOfLastWord(param);
        System.out.println(result);
    }

}

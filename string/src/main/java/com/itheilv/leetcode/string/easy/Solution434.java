package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-08
 * 题解：空格会影响Split的返回结果，多个空格可以用正则表达
 * 在可读性优于代码的情况下，用内置函数
 */
public class Solution434 {

    public static int countSegments(String s) {
        String trim = s.trim();
        if (trim.equals("")) {
            return 0;
        }
        return trim.split("\\s+").length;
    }

    public static void main(String[] args) {
        String param = ", , , ,        a, eaefa";
        int result = countSegments(param);
        System.out.println(result);
    }
}

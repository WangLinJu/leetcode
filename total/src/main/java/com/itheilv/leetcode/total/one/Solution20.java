package com.itheilv.leetcode.total.one;

/**
 * @author WSQ
 * @since 2020-09-11
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 用栈解为最优
 */
public class Solution20 {

    public static boolean isValid(String s) {
        String s1 = s;
        if (s.length() % 2 != 0) {
            return false;
        }
        while (s.length() != 0) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
            if (s == s1) {
                return false;
            }
            s1 = s;
        }
        return true;
    }

    public static void main(String[] args) {
        String param = "[]([])";
        boolean result = isValid(param);
        System.out.println(result);
    }

}

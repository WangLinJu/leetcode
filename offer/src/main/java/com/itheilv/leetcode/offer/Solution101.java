package com.itheilv.leetcode.offer;

/**
 * @author WSQ
 * @since 2020-09-18
 * 10-1
 * 裴波拉起数列
 */
public class Solution101 {
    public static int fib(int n) {
        while (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int param = 5;
        final int result = fib(param);
        System.out.println(result);
    }
}

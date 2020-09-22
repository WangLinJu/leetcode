package com.itheilv.leetcode.hash.easy;

/**
 * @author WSQ
 * @since 2020-09-18
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 */
public class Solution202 {

    public static boolean isHappy(int n) {
        while (n > 10) {
            int a = n % 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int param = 5;
        final boolean result = isHappy(param);
        System.out.println(result);
    }

}

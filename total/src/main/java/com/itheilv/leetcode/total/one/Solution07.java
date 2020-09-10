package com.itheilv.leetcode.total.one;

/**
 * @author WSQ
 * @since 2020-09-10
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * TODO
 */
public class Solution07 {

    public static int reverse01(int x) {
        try {
            char[] chars = String.valueOf(Math.abs(x)).toCharArray();
            int left = 0;
            int right = chars.length - 1;
            for (int i = 0; i < chars.length; i++) {
                if (left < right) {
                    char temp = chars[i];
                    chars[left] = chars[right];
                    chars[right] = temp;
                }
                left++;
                right--;
            }
            int result = Integer.parseInt(String.valueOf(chars));
            if (x < 0) {
                result = result * (-1);
            }
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverse02(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int) res : 0;
    }


    public static void main(String[] args) {
        int param = 1234567899;
        int result = reverse02(param);
        System.out.println(result);
    }
}

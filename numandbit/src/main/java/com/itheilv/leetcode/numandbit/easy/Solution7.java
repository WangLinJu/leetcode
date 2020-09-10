package com.itheilv.leetcode.numandbit.easy;

/**
 * @author WSQ
 * @since 2020-09-10
 */
public class Solution7 {

    /**
     * @param x the param
     * @return the result
     */
    public static int reverse01(int x) {
        char[] param = new char[0];
        try {
            if (x > Math.pow(2, 31) - 1 || x < Math.pow(-2, 31)) {
                return 0;
            }
            int length = String.valueOf(Math.abs(x)).length();
            param = String.valueOf(Math.abs(x)).toCharArray();
            int left = 0;
            int right = length - 1;
            for (int i = 0; i < length - 1; i++) {
                if (left < right) {
                    char temp = param[i];
                    param[left] = param[right];
                    param[right] = temp;
                }
                left++;
                right--;
            }
            if (x < 0) {
                return Integer.parseInt("-" + String.valueOf(param));
            }
            return Integer.parseInt(String.valueOf(param));
        } catch (NumberFormatException e) {
            return 0;
        }
    }


    public static int reverse02(int x) {
        int xx = Math.abs(x);
        long n = 0;
        int result = 0;
        while (xx > 0) {
            n = n * 10 + xx % 10;
            xx = xx / 10;
        }
        if (x > 0) {
            result = (int) n;
        } else {
            result = (int) (n * (-1));
        }
        return Math.abs(result) == Math.abs(n) ? result : 0;
    }


    public static void main(String[] args) {
        int param = 1534236469;
        int result = reverse02(param);
        System.out.println(result);
    }
}

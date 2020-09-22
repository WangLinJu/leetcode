package com.itheilv.leetcode.offer;

import java.util.Arrays;

/**
 * @author WSQ
 * @since 2020-09-21
 */
public class Solution11 {

    public static int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] param = {1, 2, 3, 4, 5};
        final int result = minArray(param);
        System.out.println(result);
    }
}

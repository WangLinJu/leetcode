package com.itheilv.leetcode.array.easy;

import java.util.Arrays;

/**
 * @author WSQ
 * @since 2020-09-21
 */
public class Solution628 {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int result = Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
        return result;
    }

    public static void main(String[] args) {
        int[] param = {-4, -3, -2, -1, 60};
        final int result = maximumProduct(param);
        System.out.println(result);
    }

}

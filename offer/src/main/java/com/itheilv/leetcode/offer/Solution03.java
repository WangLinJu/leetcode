package com.itheilv.leetcode.offer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author WSQ
 * @since 2020-09-18
 */
public class Solution03 {

    public static int findRepeatNumber01(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        throw new IllegalArgumentException("参数有误");
    }

    public static int findRepeatNumber02(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("参数有误");
    }


    public static void main(String[] args) {
        int[] param = {2, 3, 1, 0, 5, 2};
        final int result = findRepeatNumber02(param);
        System.out.println(result);
    }
}

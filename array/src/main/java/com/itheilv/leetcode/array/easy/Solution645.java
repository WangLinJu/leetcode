package com.itheilv.leetcode.array.easy;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WSQ
 * @since 2020-09-21
 */
public class Solution645 {

    public static int[] findErrorNums01(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        int repeat = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                repeat = nums[i];
            }
            if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        return new int[]{repeat, nums[nums.length - 1] < nums.length ? nums.length : missing};
    }

    public static int[] findErrorNums02(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int repeat = 1;
        int missing = 1;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    repeat = i;
                }
            } else {
                missing = i;
            }
        }
        return new int[]{repeat, missing};
    }

    public static void main(String[] args) {
        int[] param = {1, 2, 3, 4, 4};
        final int[] result = findErrorNums02(param);
        System.out.println(Arrays.toString(result));
    }

}

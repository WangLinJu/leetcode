package com.itheilv.leetcode.total.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WSQ
 * @since 2020-09-08
 * 01:两数之和
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
public class Solution01 {

    /**
     * 暴力解法  时间：O(n^2)
     * 空间 O（1）
     *
     * @param nums   the nums
     * @param target the target
     * @return the int[]
     */
    public static int[] twoSum01(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 两遍哈希表      时间：O(n)
     * 空间 O（n）
     *
     * @param nums   the nums
     * @param target the target
     * @return the int[]
     */
    public static int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if (map.containsKey(complete) && i != map.get(complete)) {
                return new int[]{i, map.get(complete)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 一次哈希表      时间：O(n)
     * 空间 O（n）
     *
     * @param nums   the nums
     * @param target the target
     * @return the int[]
     */
    public static int[] twoSum03(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if (map.containsKey(complete)) {
                return new int[]{map.get(complete), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = twoSum03(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

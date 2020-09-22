package com.itheilv.leetcode.hash.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author WSQ
 * @since 2020-09-16
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Solution349 {

    public static int[] intersection01(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                result.add(nums2[j]);
            }
        }
        final int[] array = result.stream().mapToInt(Number::intValue).toArray();
        return array;
    }

    public static int[] intersection02(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                result.add(nums2[j]);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for (Integer integer : result) {
            res[index++] = integer;
        }
        return res;
    }

    public static int[] intersection03(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        int count = 0;
        for (int j : nums2) {
            if (set.remove(j)) {
                temp[count++] = j;
            }
        }
        final int[] res = Arrays.copyOf(temp, count);
        return res;
    }

    public static void main(String[] args) {
        int[] param1 = new int[]{4, 7, 9, 7, 6, 7};
        int[] param2 = new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4};
        final int[] result = intersection03(param1, param2);
        System.out.println(Arrays.toString(result));
    }

}

package com.itheilv.leetcode.string.easy;

/**
 * @author WSQ
 * @since 2020-09-22
 */
public class Solution657 {

    public static boolean judgeCircle(String moves) {
        //定义X和Y两个变量
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                x++;
            }
            if (moves.charAt(i) == 'L') {
                x--;
            }
            if (moves.charAt(i) == 'U') {
                y++;
            }
            if (moves.charAt(i) == 'D') {
                y--;
            }
        }
        return x == 0 && y == 0;
    }

    public static boolean judgeCircle02(String moves) {
        if (moves.length() % 2 != 0) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < moves.length(); i++) {
            arr[moves.charAt(i) - 'A'] += 1;
        }
        if (arr[20] == arr[3] && arr[17] == arr[11]) {
            return true;
        }
        return false;
    }

    public static boolean judgeCircle03(String moves) {
        if (moves.length() % 2 != 0) {
            return false;
        }
        char[] m = moves.toCharArray();
        boolean res = false;
        int[] count = new int[256];
        for (int i = 0; i < moves.length(); i++) {
            count[m[i]]++;
        }
        if (count['U'] == count['D'] && count['L'] == count['R']) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        String param = "UD";
        final boolean result = judgeCircle03(param);
        System.out.println(result);
    }
}

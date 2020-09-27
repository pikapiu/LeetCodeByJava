package main.code.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoNum {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 9, 8, 7, 8, 63, 5};
        int[] result = getTargetIndexByTraverse(nums, 10);
        for (int i : result) {
            System.out.println(i);
        }
    }

    /**
     * 利用HashMap
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] getTargetIndex(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("have no results");
    }


    /**
     * 两遍for循环
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] getTargetIndexByTraverse(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("have no results");
    }
}
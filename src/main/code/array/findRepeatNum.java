package main.code.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zs
 * @Date: 2020/4/20 9:55
 * 找出数组中重复的数
 */
public class findRepeatNum {
    public static void main(String[] args) {
    int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.print(useIndex(nums));
    }

    public static int withSet(int[] nums){
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static int useIndex(int[] nums){
        int[] help = new int[nums.length];
        for (int num : nums) {
            ++help[num];
            if (help[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}

package main.code.array;

/**
 * @Author: zs
 * @Date: 2020/9/27 10:55
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {1,2,0,4,5,0,6};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
//        moveZeroesByTwoPosition(arr);
        moveZeroesByMark(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void moveZeroesByTwoPosition(int[] nums) {
        //...省略判空
        for (int p = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p++] = temp;
            }
        }
    }


    public static void moveZeroesByMark(int[] nums) {
        //...省略判空
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length){
            nums[index++] = 0;
        }
    }

}

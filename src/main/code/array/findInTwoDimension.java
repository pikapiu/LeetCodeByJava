package main.code.array;

/**
 * @Author: zs
 * @Date: 2020/4/22 8:57
 */
public class findInTwoDimension {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(find(arr,99));

    }


    /**
     * 暴力枚举
     */
    public static boolean find(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        for (int[] arrs : matrix) {
            for (int j = 0; j < columns; j++) {
                if (arrs[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 123
     */
}

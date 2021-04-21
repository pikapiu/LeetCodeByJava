package main.code.array.sort;

public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,2,-100};
        printArray(arr);
        arr = reverseArr2(arr);
        printArray(arr);
    }
    public static int[] reverseArr(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return arr;
    }

    public static int[] reverseArr2(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }
        return newArr;
    }


    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

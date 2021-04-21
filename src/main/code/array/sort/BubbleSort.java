package main.code.array.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -9, 0, 5, 3, 12, 5};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        getRandom(99,1);
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void getRandom(int min, int max){
        int range = max - min + 1;
        for (int i = 0; i <10 ; i++) {
            int random =(int) (Math.random() * range) + min;
            System.out.print(random + " ");
        }

    }
}

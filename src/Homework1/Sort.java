package Homework1;


public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int num = 0; num < array.length; num++) {
            System.out.print(array[num] + " ");
        }
    }
}























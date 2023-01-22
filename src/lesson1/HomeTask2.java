package lesson1;
// Реализуйте алгоритм сортировки пузырьком для сортировки массива

import java.util.Arrays;

public class HomeTask2 {
    public static void main(String[] args) {
        int[] arr = {11, 3, 14, 16, 7};
        System.out.println(Arrays.toString(boobleSort(arr)));
    }

    public static int[] boobleSort(int[] array) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    flag = true;
                }
            }
        }
        return array;
    }
}

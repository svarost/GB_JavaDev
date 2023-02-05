package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task0 {
    // Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
    public static void main(final String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(8, 2, 1, 5, 2));
        System.out.println(getSumOfUniqueValues(nums));
    }

    public static Integer getSumOfUniqueValues(final List<Integer> list) {
        Integer sum = 0;
        for (Integer item : list) {
            if (list.indexOf(item) == list.lastIndexOf(item)) {
                sum += item;
            }
        }
        return sum;
    }
}

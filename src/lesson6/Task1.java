package lesson6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Task1 {
    public static void main(String[] args) {
        initArray();
        System.out.println(getPercentUniqueValues(initArray()));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public static int[] initArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 24);
        }
        return arr;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public static double getPercentUniqueValues(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }

        System.out.println(set.size());

        System.out.println(set);

        return set.size() * 100 / 100;
    }
}

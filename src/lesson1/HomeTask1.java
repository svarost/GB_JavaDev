package lesson1;
// Заполните массив случайным числами и выведите максимальное,
// минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(),
// который возвращает значение в промежутке [0, 300].

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class HomeTask1 {
    public static void main(String[] args) {
        int[] array = new int[(int) (Math.random() * 30)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 300);
        }

        System.out.println(Arrays.toString(array));

        OptionalInt max = Arrays.stream(array).max();
        System.out.println(max.isPresent() ?
                ("maxItem = " + max.getAsInt()) : "empty array");

        OptionalInt min = Arrays.stream(array).min();
        System.out.println(min.isPresent() ?
                ("minItem = " + min.getAsInt()) : "empty array");

        OptionalDouble aver = Arrays.stream(array).average();
        System.out.println(aver.isPresent() ?
                ("average = " + aver.getAsDouble()) : "empty array");
    }
}

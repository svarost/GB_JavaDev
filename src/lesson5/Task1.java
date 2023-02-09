package lesson5;

import java.util.*;

public class Task1 {
    // Дана последовательность чисел. Необходимо вернуть число совпадающих пар
    // в этой последовательности
    // Пример 1:     In: arr = [1, 2]  Out: 0
    // Пример 2:     In: arr = [1, 1, 2]  Out: 1
    // Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2, 2));
        System.out.println(getNumberOfCouples(list));
    }

    public static Integer getNumberOfCouples(List<Integer> list) {
        Integer pares = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item : list) {
            map.putIfAbsent(item, 0);
            map.put(item, map.get(item) + 1);
        }
        System.out.println(map);

        for (Integer key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("map[" + key + "] = " + map.get(key));
            pares += factorial(map.get(key)) / (factorial(map.get(key) - 2) * 2);
        }
        return pares;
    }

    public static Integer factorial(Integer num) {
        if (num <= 1) {
            return Integer.valueOf(1);
        } else {
            return Integer.valueOf(num) * factorial(num - 1);
        }
    }
}

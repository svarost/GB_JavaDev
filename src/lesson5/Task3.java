package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    // Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине
    // с помощью TreeMap.
    // Строки с одинаковой длиной не должны “потеряться”.
    public static void main(String[] args) {
        String str = "I would like my aunt to visit us on Sunday";

        System.out.println(getSortedIncludesWords(stringToMap(str)));

    }

    public static String getSortedIncludesWords(Map<Integer, String> map) {
        return String.join(" ", map.values());
    }

    public static Map<Integer, String> stringToMap(String str) {
        Map<Integer, String> map = new TreeMap<>();

        for (String i : str.split(" ")) {
            map.put(Math.abs(i.hashCode()), i);
        }
        System.out.println(map);
        return map;
    }
}

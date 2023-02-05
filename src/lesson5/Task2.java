package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    // Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, идущий от
    // ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути, ведущего в другой город.
    // Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
    // Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара
    public static void main(String[] args) {
        Map<String, String> cities = new HashMap<String, String>();
        cities.put("Moscow","Samara");
        cities.put("Kursk","Penza");
        cities.put("Samara","Kursk");

        System.out.println(getFinalCity(cities));

    }

    public static String getFinalCity(Map<String, String> map) {
        for (String key : map.keySet()) {
            if (!map.containsKey(map.get(key))) {
                return map.get(key);
            }
        }
        return "Is empty";
    }
}
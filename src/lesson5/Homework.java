package lesson5;

import java.util.*;

public class Homework {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек
    // может иметь несколько телефонов.
    // Пусть дан список сотрудников: Иван Иванов (и остальные, полный текст дз будет на платформе)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.


    public static void main(String[] args) {
        ArrayList<String> contactList = new ArrayList<>(Arrays.asList(
                "Иван Иванов 88001122333",
                "Иван Курицин 88001662333",
                "Иван Курицин 88001112333",
                "Иван Незлобин 88001122432",
                "Сергей Потапов 88001112453",
                "Сергей Потапов 8800163214",
                "Сергей Курицин 8800142421",
                "Михаил Незлобин 880012343"));

        printMap(namesCount(arrToHashMap(contactList)));
    }


    public static HashMap<String, ArrayList<String>> arrToHashMap(ArrayList<String> arrayList) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String item : arrayList) {
            String[] temp = item.split(" ");

            String key = temp[0] + " " + temp[1];
            if (map.containsKey(key)) {
                map.get(key).add(temp[2]);
            } else {
                map.put(key, new ArrayList<>(Arrays.asList(temp[2])));
            }
        }
        System.out.println(map);
        return map;
    }


    public static NavigableMap namesCount(Map<String, ArrayList<String>> map) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        ArrayList<String> names = new ArrayList<>(map.keySet());
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).substring(0, names.get(i).indexOf(" ")));
        }
        HashSet<String> setNames = new HashSet<>();
        names.forEach(name -> setNames.add(name));
        for (String name : setNames) {
            for (String key : map.keySet()) {
                if (key.contains(name)) {
                    if (treeMap.containsKey(name)) {
                        treeMap.put(name, treeMap.get(name) + map.get(key).size());
                    } else {
                        treeMap.put(name, map.get(key).size());
                    }
                }
            }
        }

        TreeMap<Integer, String> rez = new TreeMap<>();
        for (String key : treeMap.keySet()) {
            rez.put(treeMap.get(key), key);
        }

        return rez.descendingMap();
    }

    public static void printMap(NavigableMap dmap) {
        for (Object key : dmap.keySet()) {
            System.out.println(dmap.get(key) + " - " + key);
        }
    }
}

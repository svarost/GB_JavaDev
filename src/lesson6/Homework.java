package lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {
// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
//      ноутбуки, отвечающие фильтру.
//      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

    public static void main(String[] args) {
        initFilters();
        initListNotebooks();
    }

    private static Map<String, String > initFilters() {
        Map<String, String> filters = new HashMap<>();
        filters.put("brand", "Lenovo");
        filters.put("memoryRAM", "8 GB");
        filters.put("memoryROM", "500 GB");
        return filters;
    }

    public static List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Dell", "Latitude 5740", "Intel Core i3", "4 GB",
                "500 GB", "MS Windows 7 x64"));
        notebooks.add(new Notebook("Lenovo", "V14 G2", "AMD Radeon Razen 5", "8 GB",
                "500 GB", "MS Windows 10 Pro"));
        notebooks.add(new Notebook("Asus", "VivoBook", "AMD Razen 5", "8 GB",
                "500 GB", "None"));
        notebooks.add(new Notebook("Asus", "VivoBook Pro 15", "Intel Core i5", "16 GB",
                "512 GB", "None"));
        notebooks.add(new Notebook("Lenovo", "IdeaPad 3", "Intel Core i3", "8 GB",
                "256 GB", "MS Windows 11 Home"));
        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {



        return null;
    }
}

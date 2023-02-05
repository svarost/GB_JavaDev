package lesson5;

import java.util.Map;

public class Homework {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек
    // может иметь несколько телефонов.
    // Пусть дан список сотрудников: Иван Иванов (и остальные, полный текст дз будет на платформе)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.

    // Иван Иванов, [9668758989б, 88888888888, 5454545]
    // Иван Иванов, 88888888888

    // key: Иван Иванов, value: [89652365, 569624]

    public static void main(String[] args) {
        Map<Double, String> phoneBook = Map.of(
                        88001122333D, "Иван Иванов",
                        88001662333D, "Иван Курицин",
                        88001112333D, "Иван Курицин",
                        88001122432D, "Иван Незлобин",
                        88001112453D, "Сергей Потапов",
                        8800163214D, "Сергей Потапов",
                        8800142421D, "Сергей Курицин",
                        880012343D, "Михаил Незлобин");

    }
}

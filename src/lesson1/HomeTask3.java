package lesson1;
// Напишите программу, которая выводит на консоль простые числа
// в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.


import java.util.ArrayList;

public class HomeTask3 {
    public static void main(String[] args) {
        ArrayList<Integer> smplNums = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) k++;
            }
            if (k == 2) smplNums.add(i);
        }

        System.out.println(smplNums);
    }
}


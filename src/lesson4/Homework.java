package lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Homework {
    //Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    public static void main(String[] args) {


//         result [0,0,1]
        LinkedList<Integer> rez1;
        rez1 = multiple(new LinkedList<>(Arrays.asList(5, -2)), new LinkedList<>(List.of(4)));
        System.out.println(rez1);

//         result [0,-2]
        LinkedList<Integer> rez2;
        rez2 = sum(new LinkedList<>(Arrays.asList(5, -2)), new LinkedList<>(List.of(5)));
        System.out.println(rez2);
    }


    // Умножьте два числа и верните произведение в виде связанного списка.
    public static LinkedList<Integer> multiple(LinkedList<Integer> d1, LinkedList<Integer> d2){
        return (toLinkedList(toInt(d1) * toInt(d2)));
    }

    // Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными
    public static LinkedList<Integer> sum(LinkedList<Integer> d1, LinkedList<Integer> d2){
        return toLinkedList(toInt(d1) + toInt(d2));
    }


    public static int toInt(LinkedList<Integer> col) {
        int rez = 0;
        int index = 1;
        int pol = col.getLast() < 0 ? -1 : 1;

        while (!col.isEmpty()) {
            rez += Math.abs(col.removeFirst()) * index;
            index *= 10;
        }
        return rez * pol;
    }


    public static LinkedList<Integer> toLinkedList(int num) {
        LinkedList<Integer> rez = new LinkedList<>();
        int pol = num < 0 ? -1 : 1;
        num = Math.abs(num);
        while (num > 9) {
            rez.add(num % 10);
            num /= 10;
        }
        rez.add(num * pol);
        return rez;
    }
}

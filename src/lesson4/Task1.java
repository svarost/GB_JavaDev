package lesson4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {
    //Даны два Deque представляющие два неотрицательных целых числа.
    // Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,8,2,4));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(2,4,5,8));
        // result [6,6,0,1]
        System.out.println(sum(d1, d2));
    }


    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        return toDeque(toInt(d1) + toInt(d2));
    }

    public static int toInt(Deque<Integer> deq) {
        int num = 0;
        int i = 0;
        while(deq.size() > 0) {
            num += deq.removeFirst() * Math.pow(10, i++);
        }
        return num;
    }

    public static ArrayDeque<Integer> toDeque(int num) {
        ArrayDeque<Integer> rezDeq = new ArrayDeque<>();
        while (num > 0) {
            rezDeq.add(num % 10);
            num /= 10;
        }
        return rezDeq;
    }
}

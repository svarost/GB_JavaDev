package lesson2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
//    Пользователь должен указать с клавиатуры чётное положительное число,
//    а программа должна создать массив указанного размера из случайных
//    целых чисел из [-5;5] и вывести его на экран в строку.
//    После этого программа должна определить и сообщить пользователю о том,
//    сумма модулей какой половины массива больше: левой или правой, либо сообщить,
//    что эти суммы модулей равны. Если пользователь введёт неподходящее число,
//    то программа должна требовать повторного ввода до тех пор,
//    пока не будет указано корректное значение.

    public static void main(String[] args) {
        int num;
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input number: ");
            if(!iScanner.hasNextInt()) {
                System.out.println("Try again.");
                iScanner.next();
            }
            else {
                num = iScanner.nextInt();
                if(num > 0 && num % 2 == 0) {
                    break;
                }
            }
        }

        int [] array = new int[num];
        for(int i = 0; i < num; i++) {
            array[i] = (int) (Math.random()*10 - 5);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < array.length / 2; i ++) {
            sum1 += Math.abs(array[i]);
            sum2 += Math.abs(array[array.length - i - 1]);
        }

        System.out.println("FirstArraySum = " + sum1);
        System.out.println("SecondArraySum = " + sum2);

        if(sum1 > sum2) {
            System.out.println("FirstHalfArray > SecondHalfArray");
        } else if (sum2 > sum1) {
            System.out.println("SecondHalfArray > FirstHalfArray");
        } else {
            System.out.println("FirstHalfArray = SecondHalfArray");
        }
    }
}

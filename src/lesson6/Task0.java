package lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task0 {
    public static void main(String[] args) {
        initHashSet();
        initLinkedHashSet();
        initTreeSet();

    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public static void initHashSet() {
        System.out.println(new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3)));

    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public static void initLinkedHashSet() {
        System.out.println(new LinkedHashSet<Integer>(Arrays.asList(6, 2, 3, 2, 4, 5, 1, 3)));
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public static void initTreeSet() {
        System.out.println(new TreeSet<Integer>(Arrays.asList(6, 2, 3, 2, 4, 5, 1, 3)));
    }
}

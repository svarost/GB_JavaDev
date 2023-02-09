package lesson4;

import java.util.ArrayDeque;

public class Task2 {
    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая
    // скобка имеет соответствующую открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false

    // ( [ { ] ) }
    // ( [ {

    public static void main(String[] args) {
        String source = "({[)]})";
        System.out.println(source + " = " + validate(source));
    }


    public static boolean validate(String source) {
        char[] openChars = {'(', '[', '{'};
        char[] closeChars = {')', ']', '}'};

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < source.length(); i++) {
            if (existArr(source.charAt(i), openChars)) {
                stack.add(source.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (!(indexOfItem(source.charAt(i), closeChars) ==
                        indexOfItem(stack.getLast(), openChars))) {
                    return false;
                }
                stack.removeLast();
            }
        }
        return true;
    }

    public static boolean existArr(char a, char[] chrArr) {
        for (char c : chrArr) {
            if (a == c)
                return true;
        }
        return false;
    }

    public static int indexOfItem(char a, char[] chrArr) {
        for (int i = 0; i < chrArr.length; i++) {
            if (chrArr[i] == a) {
                return i;
            }
        }
        return -1;
    }
}

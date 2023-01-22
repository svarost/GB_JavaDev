package lesson2;

public class Task1 {
    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {
        String s = "cba";
        int [] index = new int[] {3, 2, 1};

        System.out.println(shuffle(s, index));
    }

    public static String shuffle(final String s, final int[] index){
        String rez = "";
        for(int i = 0; i < index.length; i++) {
            rez += s.charAt(index[i] - 1);
        }
        return rez;
    }
}

package lesson2;

public class Task0 {
    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";

        System.out.println(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        String rez = "";

        for(int i = 0; i < jewels.length(); i++) {
            int count = 0;
            for(int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
            rez = rez + jewels.charAt(i) + count;
            count = 0;
        }
        return rez;
    }
}

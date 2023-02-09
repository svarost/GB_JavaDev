package lesson6;

public class Task2 {
    // Продумайте структуру класса Бульдожка. Какие поля и методы будут
    // актуальны для приложения, которое является
    // а) информационной системой ухода за ней
    // б) архивом выставки бульдожков
    // в) информационной системой Театра бульдожек имени Дарахвелидзе
    public static void main(String[] args) {
        Bulldog dog1 = new Bulldog("Bobik");
        Bulldog dog2 = new Bulldog("Robik");
        System.out.println(dog1.voice());
        dog1.setSpeed(20);
        System.out.println(dog1.run(22) + " sec");
        System.out.println(dog2.run(22) + " sec");

        System.out.println(dog1.getCount());

        Bulldog dog3 = new Bulldog("Дружок");
//        dog3.setName("Drujok");
        System.out.println(dog3.getName());
    }
}

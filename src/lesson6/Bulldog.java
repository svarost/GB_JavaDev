package lesson6;

public class Bulldog {
    private static int count = 0;
    private final String name;
    private String color;
    private int age;
    private int weight;
    private int awards;
    private int speed;
    private String shampoo;


    public Bulldog(String name) {
        this.name = name;
        age = 1;
        awards = 1;
        weight = 9;
        color = "red";
        speed = 40;
        count++;
    }

    public double run(double distance) {
        return distance / this.speed;
    }

    public String voice() {
        return "Gav-gav";
    }

    public int getAge() {
        return age;
    }

    public int getAwards() {
        return awards;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

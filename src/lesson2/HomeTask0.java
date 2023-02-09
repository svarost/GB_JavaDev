package lesson2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeTask0 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task0.class.getName());
        logger.setLevel(Level.WARNING);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        Scanner sc = new Scanner(System.in);
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\src\\lesson2\\result.txt");
        System.out.println("pathFile = " + pathFile);

        try {
            System.out.print("Введите число типа byte (от -128 до 127): ");
            byte num = sc.nextByte();
            FileWriter fileOut = new FileWriter(pathFile);
            fileOut.write(num);
            fileOut.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}

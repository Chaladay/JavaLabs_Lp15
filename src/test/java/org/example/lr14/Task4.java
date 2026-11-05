package org.example.lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("rad.txt");
        Scanner in = new Scanner(System.in);
        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("Введите 15 значений радиации:");
            for (int i = 0; i < 15; i++) writer.write(in.nextDouble() + "\n");
        } catch (IOException e) { System.out.println(e.getMessage()); }

        double sum = 0; int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextDouble()) { sum += scanner.nextDouble(); count++; }
        } catch (IOException e) { System.out.println(e.getMessage()); }
        System.out.println("Средний уровень: " + (sum / count));
    }
}

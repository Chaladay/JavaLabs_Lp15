package org.example.lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("f5.txt");
        Random r = new Random();
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) writer.write(r.nextInt(150) + "\n");
        } catch (IOException e) { System.out.println(e.getMessage()); }

        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) if (scanner.nextInt() > 75) count++;
        } catch (IOException e) { System.out.println(e.getMessage()); }
        System.out.println("Чисел больше 75: " + count);
    }
}

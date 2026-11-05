package org.example.lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("f.txt");
        Scanner in = new Scanner(System.in);
        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) writer.write(in.nextInt() + "\n");
        } catch (IOException e) { System.out.println(e.getMessage()); }

        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                if (num % 2 == 0 || num % 3 == 0) count++;
            }
        } catch (IOException e) { System.out.println(e.getMessage()); }
        System.out.println("\nКратных 2 или 3: " + count);
    }
}

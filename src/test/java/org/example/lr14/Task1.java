package org.example.lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("plant.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Мое любимое растение - Кактус.\nОн неприхотлив.");
            System.out.println("Файл создан.");
        } catch (IOException e) { System.out.println(e.getMessage()); }

        System.out.println("Имя: " + file.getName() + ", Путь: " + file.getAbsolutePath() + ", Размер: " + file.length() + " байт");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) System.out.println(scanner.nextLine());
        } catch (IOException e) { System.out.println(e.getMessage()); }
    }
}
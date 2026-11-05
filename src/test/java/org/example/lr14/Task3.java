package org.example.lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("f3.txt"), g = new File("g.txt"), h = new File("h.txt");
        Random r = new Random();
        try (FileWriter w = new FileWriter(f)) {
            for (int i = 0; i < 20; i++) w.write(r.nextInt(100) + "\n");
        } catch (IOException e) { System.out.println(e.getMessage()); }

        try (Scanner sc = new Scanner(f); FileWriter wg = new FileWriter(g); FileWriter wh = new FileWriter(h)) {
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 5 == 0 && num % 7 == 0) wg.write(num + "\n");
                else wh.write(num + "\n");
            }
        } catch (IOException e) { System.out.println(e.getMessage()); }
        System.out.println("Готово. Файлы g.txt и h.txt созданы.");
    }
}
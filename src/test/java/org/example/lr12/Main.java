package org.example.lr12;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("=== ЗАДАНИЕ 1: Map ===");
        Map<String, Dish> dishes = new HashMap<>();
        dishes.put("Тарелка 1", new Plate("Тарелка 1", 101, 0.5, 25.0));
        dishes.put("Тарелка 2", new Plate("Тарелка 2", 102, 0.4, 20.0));
        dishes.put("Тарелка 3", new Plate("Тарелка 3", 103, 0.6, 30.0));
        dishes.put("Чашка 1", new Cup("Чашка 1", 201, 0.3, true));
        dishes.put("Чашка 2", new Cup("Чашка 2", 202, 0.25, false));
        dishes.put("Чашка 3", new Cup("Чашка 3", 203, 0.35, true));
        dishes.put("Миска 1", new Bowl("Миска 1", 301, 1.5, 10.0));
        dishes.put("Миска 2", new Bowl("Миска 2", 302, 2.0, 12.0));

        for (Map.Entry<String, Dish> entry : dishes.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue().displayInfo());
        }


        System.out.println("\n=== ЗАДАНИЕ 2: List + Сортировка ===");
        List<Coach> coaches = new ArrayList<>(Arrays.asList(
                new Coach(1, "Иван", "Футбол", 1, Arrays.asList(5, 4, 5, 3)),
                new Coach(2, "Анна", "Баскетбол", 2, Arrays.asList(4, 4, 4, 4)),
                new Coach(3, "Петр", "Плавание", 1, Arrays.asList(2, 3, 2, 3)),
                new Coach(4, "Олег", "Бокс", 3, Arrays.asList(5, 5, 3, 5)),
                new Coach(6, "лег", "Бокс", 3, Arrays.asList(5, 5, 3, 5)), // Тестовый объект препода
                new Coach(5, "Мария", "Гимнастика", 2, Arrays.asList(3, 3, 3, 3))
        ));

        System.out.println("1. Рейтинг > 3:");
        for (Coach c : coaches) if (c.getAverageRating() > 3) System.out.println(c.getName() + " (" + c.getAverageRating() + ")");

        System.out.println("\n2. Повышение уровня (рейтинг >= 4):");
        for (Coach c : coaches) {
            if (c.getAverageRating() >= 4.0) {
                c.setLevel(c.getLevel() + 1);
                System.out.println(c.getName() + " повышен до " + c.getLevel());
            }
        }

        System.out.println("\n3. Печать уровня 2:");
        printCoaches(coaches, 2);

        System.out.println("\n4. Сортировка (по убыванию рейтинга, затем по имени, затем по ID):");
        coaches.sort((c1, c2) -> {
            int ratingCompare = Double.compare(c2.getAverageRating(), c1.getAverageRating());
            if (ratingCompare != 0) return ratingCompare;
            int nameCompare = c1.getName().compareTo(c2.getName());
            if (nameCompare != 0) return nameCompare;
            return Integer.compare(c1.getId(), c2.getId());
        });

        for (Coach c : coaches) System.out.println(c.displayInfo());
    }

    public static void printCoaches(List<Coach> coaches, int level) {
        for (Coach c : coaches) if (c.getLevel() == level) System.out.println(c.getName() + " — уровень " + c.getLevel());
    }
}

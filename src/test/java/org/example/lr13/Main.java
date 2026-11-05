package org.example.lr13;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тест 1: Некорректный вес ===");
        try {
            new Delivery("ORD-1", "ул. Ленина, 5", -2.5, 10.0);
        } catch (InvalidDeliveryDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }

        System.out.println("\n=== Тест 2: Успешная доставка ===");
        try {
            Delivery d1 = new Delivery("ORD-2", "пр. Мира, 10", 5.0, 15.5);
            d1.startDelivery();
            d1.completeDelivery();
        } catch (InvalidDeliveryDataException | DeliveryException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Тест 3: Завершение до начала ===");
        try {
            Delivery d2 = new Delivery("ORD-3", "ул. Гагарина, 3", 2.0, 5.0);
            d2.completeDelivery();
        } catch (InvalidDeliveryDataException | DeliveryException e) {
            System.out.println("Ошибка статуса: " + e.getMessage());
        }
    }
}


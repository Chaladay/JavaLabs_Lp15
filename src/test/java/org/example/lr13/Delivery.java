package org.example.lr13;

public class Delivery {
    private String orderId, address, status;
    private double weight, distance;

    public Delivery(String orderId, String address, double weight, double distance) throws InvalidDeliveryDataException {
        if (weight <= 0) throw new InvalidDeliveryDataException("Вес должен быть > 0");
        if (distance <= 0) throw new InvalidDeliveryDataException("Расстояние должно быть > 0");
        this.orderId = orderId;
        this.address = address;
        this.weight = weight;
        this.distance = distance;
        this.status = "Ожидает";
    }

    public void startDelivery() throws DeliveryException {
        if (status.equals("В пути")) throw new DeliveryException("Доставка уже начата!");
        if (status.equals("Завершена")) throw new DeliveryException("Доставка уже завершена!");
        status = "В пути";
        System.out.println("Доставка " + orderId + " начата.");
    }

    public void completeDelivery() throws DeliveryException {
        if (!status.equals("В пути")) throw new DeliveryException("Нельзя завершить доставку, которая не в пути!");
        status = "Завершена";
        System.out.println("Доставка " + orderId + " успешно завершена.");
    }
}

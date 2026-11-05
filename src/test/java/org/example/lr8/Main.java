package org.example.lr8;

class Carrier {
    private String name; private double capacity; private double speed;
    public Carrier(String name, double capacity, double speed) { this.name = name; this.capacity = capacity; this.speed = speed; }
    public void deliver() { System.out.println("Доставить груз"); }
    public String getName() { return name; } public double getCapacity() { return capacity; }
}
class Ship extends Carrier {
    private String tonnage;
    public Ship(String tonnage, String name, double capacity, double speed) { super(name, capacity, speed); this.tonnage = tonnage; }
    @Override public void deliver() { System.out.println("Перевозка по воде"); }
    public void anchor() { System.out.println("Корабль бросил якорь"); }
}
class Truck extends Carrier {
    private int wheels;
    public Truck(int wheels, String name, double capacity, double speed) { super(name, capacity, speed); this.wheels = wheels; }
    @Override public void deliver() { System.out.println("Перевозка по суше"); }
    public void loadCargo() { System.out.println("Загрузка груза"); }
}
public class Main {
    public static void main(String[] args) {
        Carrier[] carriers = {
                new Ship("500t", "Титаник", 1000, 40),
                new Truck(8, "Вольво", 20, 90)
        };
        for (Carrier c : carriers) { c.deliver(); }
        new Ship("500t", "Титаник", 1000, 40).anchor();
        new Truck(8, "Вольво", 20, 90).loadCargo();
    }
}
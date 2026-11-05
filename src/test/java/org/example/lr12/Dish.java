package org.example.lr12;

public abstract class Dish {
    private String name;
    private int id;
    private double volume;

    public Dish(String name, int id, double volume) {
        this.name = name;
        this.id = id;
        this.volume = volume;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getVolume() { return volume; }

    public abstract String displayInfo();
}
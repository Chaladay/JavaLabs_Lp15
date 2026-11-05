package org.example.lr12;

public class Bowl extends Dish {
    private double depth;

    public Bowl(String name, int id, double volume, double depth) {
        super(name, id, volume);
        this.depth = depth;
    }

    @Override
    public String displayInfo() {
        return "Bowl{название='" + getName() + "', id=" + getId() + ", объем=" + getVolume() + ", глубина=" + depth + "}";
    }
}
package org.example.lr12;

public class Cup extends Dish {
    private boolean handle;

    public Cup(String name, int id, double volume, boolean handle) {
        super(name, id, volume);
        this.handle = handle;
    }

    @Override
    public String displayInfo() {
        return "Cup{название='" + getName() + "', id=" + getId() + ", объем=" + getVolume() + ", ручка=" + handle + "}";
    }
}

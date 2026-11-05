package org.example.lr12;

import java.util.List;

public class Coach {
    private int id;
    private String name;
    private String sport;
    private int level;
    private List<Integer> athleteRatings;

    public Coach(int id, String name, String sport, int level, List<Integer> athleteRatings) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.level = level;
        this.athleteRatings = athleteRatings;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public double getAverageRating() {
        if (athleteRatings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : athleteRatings) sum += r;
        return (double) sum / athleteRatings.size();
    }

    public String displayInfo() {
        return "ID: " + id + ", Имя: " + name + ", Рейтинг: " + getAverageRating();
    }
}

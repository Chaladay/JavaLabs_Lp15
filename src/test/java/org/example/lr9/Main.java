package org.example.lr9;

abstract class Sportsman {
    private String name; private String team; private int number;
    public Sportsman(String name, String team, int number) { this.name = name; this.team = team; this.number = number; }
    public String getName() { return name; } public String getTeam() { return team; } public int getNumber() { return number; }
    public abstract void getPosition();
    public abstract void getStatistics();
    public void displayInfo() { System.out.println("Имя: " + name + ", Команда: " + team + ", Номер: " + number); }
}
class Forward extends Sportsman {
    private int goals;
    public Forward(String name, String team, int number, int goals) { super(name, team, number); this.goals = goals; }
    @Override public void getPosition() { System.out.println("Нападающий"); }
    @Override public void getStatistics() { System.out.println(goals + " голов, 5 передач"); }
}
class Defender extends Sportsman {
    private int tackles;
    public Defender(String name, String team, int number, int tackles) { super(name, team, number); this.tackles = tackles; }
    @Override public void getPosition() { System.out.println("Защитник"); }
    @Override public void getStatistics() { System.out.println(tackles + " отборов, 10 перехватов"); }
}
public class Main {
    public static void main(String[] args) {
        Sportsman[] team = {
                new Forward("Иван", "Динамо", 10, 15),
                new Forward("Петр", "Динамо", 7, 8),
                new Defender("Олег", "Динамо", 4, 25),
                new Defender("Сергей", "Динамо", 5, 18),
                new Defender("Антон", "Динамо", 3, 30)
        };
        for (Sportsman s : team) { s.displayInfo(); s.getPosition(); s.getStatistics(); System.out.println("---"); }
    }
}
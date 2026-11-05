package org.example.lr10;

interface Installable { void install(); void uninstall(); }
interface Updatable { void update(); String getVersion(); }

class Game implements Installable, Updatable {
    private String name, version, genre;
    public Game(String name, String version, String genre) { this.name = name; this.version = version; this.genre = genre; }
    public void install() { System.out.println("Установка игры " + name); }
    public void uninstall() { System.out.println("Удаление игры " + name); }
    public void update() { System.out.println("Обновление игры " + name); }
    public String getVersion() { return version; }
}
class Editor implements Installable, Updatable {
    private String name, version, format;
    public Editor(String name, String version, String format) { this.name = name; this.version = version; this.format = format; }
    public void install() { System.out.println("Установка редактора " + name); }
    public void uninstall() { System.out.println("Удаление редактора " + name); }
    public void update() { System.out.println("Обновление редактора " + name); }
    public String getVersion() { return version; }
}
public class Main {
    public static void main(String[] args) {
        Installable[] soft = {
                new Game("Ведьмак", "1.0", "RPG"),
                new Game("Танки", "2.5", "Шутер"),
                new Game("Сапер", "1.1", "Логика"),
                new Editor("Photoshop", "2024", "PSD"),
                new Editor("VS Code", "1.85", "TXT")
        };
        for (Installable s : soft) {
            s.install(); s.uninstall();
            if (s instanceof Updatable) { ((Updatable) s).update(); System.out.println("Версия: " + ((Updatable) s).getVersion()); }
            System.out.println("---");
        }
    }
}
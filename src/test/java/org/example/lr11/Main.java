package org.example.lr11;

class Instrument {
    private String name, type, sound;
    public Instrument(String name, String type, String sound) { this.name = name; this.type = type; this.sound = sound; }
    public void play() { System.out.println("Играю"); }
    public void play(int volume) { System.out.println("Играю громкостью " + volume); }
    public void play(String melody) { System.out.println("Играю мелодию " + melody); }
    public String getSoundType() { return "Стандартный звук"; }
}
class Guitar extends Instrument {
    private int strings;
    public Guitar(String name, String type, String sound, int strings) { super(name, type, sound); this.strings = strings; }
    @Override public String getSoundType() { return "Струнный звук"; }
}
class Piano extends Instrument {
    private int keys;
    public Piano(String name, String type, String sound, int keys) { super(name, type, sound); this.keys = keys; }
    @Override public String getSoundType() { return "Клавишный звук"; }
}
public class Main {
    public static void main(String[] args) {
        Instrument base = new Instrument("Базовый", "Духовой", "Звук");
        base.play(); base.play(50); base.play("Мелодия 1");

        Instrument[] inst = { new Guitar("Гитара", "Струнный", "Дзынь", 6), new Piano("Пианино", "Клавишный", "Динь", 88) };
        for (Instrument i : inst) { i.play(); System.out.println("Тип: " + i.getSoundType()); }
    }
}
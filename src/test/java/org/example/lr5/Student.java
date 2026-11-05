package org.example.lr5;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name; this.age = age; this.group = group;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String displayInfo() {
        return "Имя: " + name + ", возраст: " + age + ", группа: " + group;
    }

    // Тестовый запуск
    public static void main(String[] args) {
        Student s1 = new Student("Анна", 20, "Т-201");
        System.out.println(s1.displayInfo());
    }
}


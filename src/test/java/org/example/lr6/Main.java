package org.example.lr6;

class Student {
    // 1. Приватные поля (Инкапсуляция)
    private String name;
    private int age;
    private String group;

    // 2. Конструктор
    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    // 3. Геттеры и Сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    // 4. Метод displayInfo
    public String displayInfo() {
        return "Имя: " + name + ", Возраст: " + age + ", Группа: " + group;
    }

    // Тестовый запуск в main
    public static void main(String[] args) {
        Student s1 = new Student("Анна", 20, "Т-201");
        Student s2 = new Student("Ольга", 25, "Т-202");

        System.out.println(s1.displayInfo());
        System.out.println(s2.displayInfo());
    }
}
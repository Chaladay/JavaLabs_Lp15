package org.example.lr7;

public class Main {
    public static void main(String[] args) {

        // Демонстрация перегрузки (Overload)
        System.out.println("Сумма 2-х целых: " + sum(5, 10));
        System.out.println("Сумма 3-х целых: " + sum(5, 10, 15));
        System.out.println("Сумма 2-х дробных: " + sum(5.5, 10.5));

        // Демонстрация работы с объектом
        Calculator calc = new Calculator(10);
        calc.showValue();
        calc.add(5);
        calc.showValue();

        // Демонстрация static
        System.out.println("Всего создано калькуляторов: " + Calculator.count);
    }

    // ПЕРЕГРУЗКА (Одинаковое имя, разные параметры)
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}

class Calculator {
    private int value; // приватное поле

    // СТАТИЧЕСКОЕ ПОЛЕ (общее для всех)
    public static int count = 0;

    // СТАТИЧЕСКАЯ КОНСТАНТА (final)
    public static final double PI = 3.14159;

    // Конструктор
    public Calculator(int value) {
        this.value = value; // THIS указывает на поле текущего объекта
        count++;            // Увеличиваем общий счетчик
    }

    // Перегрузка конструктора (конструктор без параметров вызывает конструктор с параметром через THIS)
    public Calculator() {
        this(0);
    }

    public void add(int num) {
        this.value += num;
    }

    public void showValue() {
        System.out.println("Текущее значение: " + value);
    }
}

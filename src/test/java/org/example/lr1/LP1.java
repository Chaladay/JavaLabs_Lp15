package org.example.lr1;

public class LP1 {
        public static void main(String[] args) {
            // 23. Перевести градусы Кельвины в Цельсии
            double k = 300;
            double c = k - 273.15;
            System.out.println(k + " Кельвинов = " + c + " Цельсиев");

            // 23. Кратность 7 или 11, но не одновременно
            int num = 14;
            boolean div7 = num % 7 == 0;
            boolean div11 = num % 11 == 0;
            if ((div7 || div11) && !(div7 && div11)) System.out.println(num + " подходит");
            else System.out.println(num + " не подходит");

            // 23. Максимальная цифра в числе
            int n = 5839;
            int temp = Math.abs(n);
            int max = temp % 10;
            temp /= 10;
            while (temp > 0) {
                if (temp % 10 > max) max = temp % 10;
                temp /= 10;
            }
            System.out.println("Макс цифра: " + max);
        }
    }

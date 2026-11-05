package org.example.lr2;

public class Main {
    public static void main(String[] args) {
        // 23. Вывести уникальные элементы
        int[] arr = {1, 2, 2, 3, 1, 4, 5, 3, 6};
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) { unique = false; break; }
            }
            if (unique) System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 23. Сумма и число положительных над побочной диагональю
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0, count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j < 2 && A[i][j] > 0) { sum += A[i][j]; count++; }
            }
        }
        System.out.println("Сумма: " + sum + ", Кол-во: " + count);
    }
}

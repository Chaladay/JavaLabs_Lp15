package org.example.lr3;

public class Main {
    public static void main(String[] args) {
        String str = "строка";
        System.out.println("Содержит 'Java'? " + str.contains("Java"));

        String text = "А роза упала на лапу Азора";
        String lower = text.replace(" ", "").toLowerCase();
        boolean isPal = true;
        for (int i = 0, j = lower.length() - 1; i < j; i++, j--) {
            if (lower.charAt(i) != lower.charAt(j)) { isPal = false; break; }
        }
        System.out.println("Палиндром? " + isPal);

        String input = "a1a a2b a3c a4d a5e";
        for (String word : input.split(" ")) {
            if (word.matches("a[0-9][b-e]")) System.out.println(word);
        }
    }
}

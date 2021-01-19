package senla.tasks.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minLength = 0;
        int maxLength = 100;

        System.out.println("Введите длину последовательности от " + minLength + " до " + maxLength + ":");

        int sequenceLength = scanner.nextInt();

        if (sequenceLength < minLength || sequenceLength > maxLength) {
            System.out.println("Длина последовательности должна быть в диапазоне чисел от " + minLength + " до " + maxLength);
        } else {
            System.out.println("Числа-палиндромы в диапазоне чисел от " + minLength + " до " + sequenceLength + ":");
            for (int i = minLength; i <= sequenceLength; i++) {
                if (isPalindrome(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPalindrome(int initialNumber) {
        int number = initialNumber;
        int reverseNumber = 0;

        while (number != 0) {
            int residue = number % 10;
            reverseNumber = reverseNumber * 10 + residue;
            number = number / 10;
        }

        return initialNumber == reverseNumber;
    }
}

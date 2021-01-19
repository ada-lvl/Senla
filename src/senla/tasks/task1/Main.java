package senla.tasks.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");

        if (isInteger(scanner)) {
            int number = scanner.nextInt();
            isEven(number);
            isPrime(number);
        }
    }

    public static void isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Число является составным!");
                    return;
                }
            }
            System.out.println("Число является простым!");
        } else {
            System.out.println("Число не является простым или составным!");
        }
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Число является чётным!");
        } else {
            System.out.println("Число является нечётным!");
        }
    }

    public static boolean isInteger(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return true;
        } else {
            System.out.println("Число не является целым!");
            return false;
        }
    }
}

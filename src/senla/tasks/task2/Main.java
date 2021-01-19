package senla.tasks.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        if (scanner.hasNextInt()) {
            firstNumber = scanner.nextInt();
            if (firstNumber < 1) {
                System.out.println("Число не является натуральным!");
                return;
            }
        } else {
            System.out.println("Число не является целым!");
            return;
        }

        System.out.println("Введите второе число:");
        if (scanner.hasNextInt()) {
            secondNumber = scanner.nextInt();
            if (secondNumber < 1) {
                System.out.println("Число не является натуральным!");
                return;
            }
        } else {
            System.out.println("Число не является целым!");
            return;
        }

        int gcf = gcf(firstNumber, secondNumber);
        int lcf = lcf(gcf, firstNumber, secondNumber);

        System.out.println("НОД: " + gcf);
        System.out.println("НОК: " + lcf);
    }

    public static int gcf(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }

        return num1 + num2;
    }

    public static int lcf(int gcf, int num1, int num2) {
        if (gcf > 0) {
            return (num1 * num2) / gcf;
        } else {
            return 0;
        }
    }
}

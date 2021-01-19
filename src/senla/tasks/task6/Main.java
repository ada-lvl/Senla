package senla.tasks.task6;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxWeight = 0;
        int maxNumber = 100;
        int minNumber = 1;
        int itemsCount = 0;

        System.out.println("Введите количество предметов:");
        itemsCount = scanner.nextInt();

        System.out.println("Введите грузоподъемность рюкзака:");
        maxWeight = scanner.nextInt();

        System.out.println("Сгенерированные предметы:");
        Item[] items = new Item[itemsCount];
        for (int i = 0; i < itemsCount; i++) {
            items[i] = new Item();
            items[i].setValue(getRandomNumber(minNumber, maxNumber));
            items[i].setWeight(getRandomNumber(minNumber, maxWeight));
            System.out.println("\tПредмет " + (i + 1) + ": Вес = " +
                    items[i].getWeight() + ", Стоимость = " + items[i].getValue());
        }


        knapsackByDynProgramming(items, maxWeight, itemsCount);
    }

    public static void knapsackByDynProgramming(Item[] items, int M, int n) {
        int B[][] = new int[n + 1][M + 1];

        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= M; j++) {
                B[i][j] = 0;
            }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = B[i - 1][j];

                if ((j >= items[i - 1].getWeight()) &&
                        (B[i][j] < B[i - 1][j - items[i - 1].getWeight()] + items[i - 1].getValue())) {
                    B[i][j] = B[i - 1][j - items[i - 1].getWeight()] + items[i - 1].getValue();
                }
            }
        }

        System.out.println("Максимальная ценность груза: " + B[n][M]);

        System.out.println("Выбранные предметы: ");

        while (n != 0) {
            if (B[n][M] != B[n - 1][M]) {
                System.out.println("\tПредмет " + n + ": Вес = " + items[n - 1].getWeight() +
                        ", Стоимость = " + items[n - 1].getValue());

                M = M - items[n - 1].getWeight();
            }

            n--;
        }
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}

package senla.tasks.task3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;
        String[] words;

        System.out.println("Введите предложение:");
        words = scanner.nextLine().split(" +");
        wordCount = words.length;
        Arrays.sort(words);

        System.out.print("Количество слов в предложении: ");
        System.out.println(wordCount);

        System.out.println("Слова:");
        for (int i = 0; i < wordCount; i++) {
            words[i] = firstToUpperCase(words[i]);
            System.out.println(words[i]);
        }

    }

    public static String firstToUpperCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}

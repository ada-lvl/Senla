package senla.tasks.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";
        String word = "";
        int wordCount = 0;
        String buffer = "";

        System.out.println("Введите предложение:");
        sentence = scanner.nextLine().toLowerCase();

        System.out.println("Введите слово:");
        word = scanner.nextLine().toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == word.charAt(0)) {
                for (int j = 0; j < word.length(); j++) {
                    if (sentence.charAt(i + j) == word.charAt(j)) {
                        buffer += sentence.charAt(i + j);
                        if (buffer.equals(word)) {
                            wordCount++;
                            i += j;
                            buffer = "";
                            break;
                        }
                    } else {
                        buffer = "";
                        break;
                    }
                }
            }
        }

        System.out.println("Количество упоминаний слова \"" + word + "\":");
        System.out.println(wordCount);
    }
}

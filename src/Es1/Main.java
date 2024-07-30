package Es1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 0;

        while (true) {
            System.out.println("Enter a number: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) {
                    break;
                } else {
                    System.out.println("number must higher than 0");
                }
            } else {
                System.out.println("please, enter a valid number");
                scanner.next();
            }
        }

        ArrayList<String> words = new ArrayList<>();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter word " + (i + 1) + ": ");
            String word = scanner.nextLine();
            words.add(word);
        }

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicatedWords = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicatedWords.add(word);
            }
        }

        if (duplicatedWords.isEmpty()) {
            System.out.println("there is not duplicates");
        } else {
            System.out.println("There words are duplicates: ");
            for (String w : duplicatedWords) {
                System.out.println(w);
            }
        }

        System.out.println("Distinct words are : " + uniqueWords.size());

        System.out.println("List of distinct words: ");
        for (String w : uniqueWords) {
            System.out.println(w);
        }

        scanner.close();

    }
}
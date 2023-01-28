import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = sc.nextLine();
        }
        Arrays.sort(words, Comparator.comparingInt(String::length));

        for (String word : words) {
            System.out.print(word+" ");
        }
    }
}
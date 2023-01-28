import java.util.Scanner;

public class ReplaceAllSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sentence = sentence.replaceAll("\\s+", " ");
        System.out.println(sentence);
    }
}

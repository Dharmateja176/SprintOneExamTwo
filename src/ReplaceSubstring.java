import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String originalString = sc.nextLine();
        String substring = sc.nextLine();
        String replacement = sc.nextLine();
        String modifiedString = originalString.replace(substring, replacement);

        System.out.println("replaced string: " + modifiedString);
    }
}
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String reversedString = new StringBuilder(originalString).reverse().toString();

        System.out.println(reversedString);
    }
}

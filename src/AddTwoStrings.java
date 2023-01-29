import java.util.Scanner;

public class AddTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        one = one+" ";
        String result = one.concat(two);
        System.out.println(result);
    }
}

import java.util.Scanner;

public class NumberOfLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNextLine()){
            count++;
            String s = sc.nextLine();
            if(s.equals("q"))
                break;
        }
        System.out.println(count-1);
    }
}

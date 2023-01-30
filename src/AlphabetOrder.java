import java.util.Scanner;

public class AlphabetOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] counts = new int[26];
        for(int i = 0;i < input.length(); i++){
            int index = (int)input.charAt(i)-97;
            counts[index]++;
        }
        int i = 0;
        String result ="";
        for(int count : counts){
            if(count == 0){ i++; continue;}
            char ch = (char) ((char)97+i);
            for(int times =0;times<count;times++){
                result += ch;
            }
            i++;
        }
        System.out.println(result);
    }
}

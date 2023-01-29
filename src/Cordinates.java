import java.util.ArrayList;
import java.util.Scanner;

public class Cordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int np = sc.nextInt();
        String[] namePers;
        namePers = new String[np];
        ArrayList<String> chola = new ArrayList<>();
        ArrayList<String> chera = new ArrayList<>();
        ArrayList<String> pallava = new ArrayList<>();
        ArrayList<String> pandya = new ArrayList<>();
        ArrayList<String> renounce = new ArrayList<>();
        for(int i = 0;i<np;i++){
            namePers[i] = sc.next();
            int xc = sc.nextInt();
            int yc = sc.nextInt();

            if(xc == 0 && yc == 0){
                renounce.add(namePers[i]);
            } else if (xc > 0 && yc > 0) {
                chola.add(namePers[i]);
            }else if (xc < 0 && yc < 0) {
                pallava.add(namePers[i]);
            }else if (xc > 0 && yc < 0) {
                chera.add(namePers[i]);
            }else{
                pandya.add(namePers[i]);
            }
        }
        System.out.println("chola");
        System.out.println(chola);
        System.out.println("chera");
        System.out.println(chera);
        System.out.println("pallava");
        System.out.println(pallava);
        System.out.println("pandya");
        System.out.println(pandya);
        System.out.println("renounce");
        System.out.println(renounce);
    }
}

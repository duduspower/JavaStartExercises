import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] imiona = new String[5];

        for(int i = 0; i < imiona.length; i++){
            System.out.println("Podaj imię : ");
            imiona[i] = in.nextLine();
            imiona[i] = imiona[i].substring(0,1).toUpperCase() + imiona[i].substring(1);
        }

        System.out.println("\n\n\n");

        for(int j = 0; j < imiona.length; j++){
            System.out.println("Witaj " + imiona[j]);
        }

    }
}

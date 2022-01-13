import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int zegar = in.nextInt();

        do {
            System.out.println("Bomba wybuchnie za : " + zegar);
            zegar--;
        }while(zegar > 0);
        System.out.println("(Wybuch.mp3) XD");
    }
}

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int zegar = in.nextInt();

        for(int i = zegar; i > 0; i--){
            System.out.println("Bomba wybuchnie za : " + i);
        }
        System.out.println("(Wybuch.mp3) XD");
    }
}
// pozostałe 2 warianty w Ex101 i Ex102

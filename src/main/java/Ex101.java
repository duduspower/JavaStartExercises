import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbę : ");
            int zegar = in.nextInt();

           while(zegar > 0){
               System.out.println("Bomba wybuchnie za : " + zegar);
               zegar--;
           }
            System.out.println("(Wybuch.mp3) XD");
    }
}

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę : ");
        double a = in.nextDouble();

        System.out.println("Podaj 2 liczbę : ");
        double b = in.nextDouble();

        System.out.println("\n\nWyniki : ");
        System.out.println("Dodawanie : " + (a + b));
        System.out.println("Odejmowanie : " + (a - b));
        System.out.println("Mnożenie : " + (a * b));
        System.out.println("Dzielenie : " + (a / b));

    }
}

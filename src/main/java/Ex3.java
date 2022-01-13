import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę : ");
        double a = in.nextDouble();
        System.out.println("Podaj 2 liczbę : ");
        double b = in.nextDouble();
        System.out.println("Podaj 3 liczbę : ");
        double c = in.nextDouble();

        double wynik1 = (a + b) * c;
        double wynik2 = a - b / c;

        System.out.println("\nWynik 1 : " + wynik1);
        System.out.println(  "Wynik 2 : " + wynik2);

        a++;b++;c++;

        System.out.print("\na + b > c    ");
        System.out.print(a + b > c);

        System.out.print("\na == b       ");
        System.out.print(a == b);
    }
}

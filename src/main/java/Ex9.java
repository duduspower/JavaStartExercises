import java.math.BigInteger;

public class Ex9 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("92233720368547758072");
        BigInteger b = new BigInteger("92233720368547758071");

        System.out.println("Dodawanie               : " + a.add(b).toString());
        System.out.println("Odejmowanie             : " + a.subtract(b).toString());
        System.out.println("Mnożenie                : " + a.multiply(b).toString());
        System.out.println("Dzielenie               : " + a.divide(b).toString());
        System.out.println("Liczba A do potęgi 12   : " + a.pow(12));
        System.out.println("Wartość bezwzględna     : " + a.abs());



    }
}
//max long 9223372036854775807
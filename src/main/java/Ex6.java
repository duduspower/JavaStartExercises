public class Ex6 {
    public static void main(String[] args) {
        firma firma = new firma();

        firma.pracownik1.imie = "Dominik";
        firma.pracownik1.nazwisko = "Duda";
        firma.pracownik1.age = 18;

        firma.pracownik2.imie = "Paweł";
        firma.pracownik2.nazwisko = "Brzęczeszczykiewicz";
        firma.pracownik2.age = 32;

        System.out.println("Kartoteka : ");
        System.out.println("Pracownik 1 : \nImie : " + firma.pracownik1.imie + "\nNazwisko : " + firma.pracownik1.nazwisko + "\nWiek : " + firma.pracownik1.age);
        System.out.println("");
        System.out.println("Pracownik 2 : \nImie : " + firma.pracownik2.imie + "\nNazwisko : " + firma.pracownik2.nazwisko + "\nWiek : " + firma.pracownik2.age);

    }

    public static class pracownik{
        String imie;
        String nazwisko;
        int age;

    }
    public static class firma{
        pracownik pracownik1 = new pracownik();
        pracownik pracownik2 = new pracownik();
    }
}

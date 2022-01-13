public class Ex7 {
    public static void main(String[] args) {
        pracownik[] majstry = new pracownik[3];

        String[] imiona = {"Stasiu", "Zdzisiu" , "Mietek"};
        String[] nazwisko = {"Wiertło", "Młotek", "Czajnik"};
        int[] age = {45, 37, 48};

        if(imiona.length != nazwisko.length || nazwisko.length!= age.length){
            System.out.println("Liczba elementów w zbiorach jest różna");
            System.exit(0);
        }

        System.out.println("Robota : ");

        for(int i = 0; i < imiona.length; i++){
            majstry[i] = new pracownik();
            majstry[i].imie = imiona[i];
            majstry[i].nazwisko = nazwisko[i];
            majstry[i].wiek = age[i];
            System.out.println("Pracownik" + i + " : ");
            System.out.println("Imię : " + majstry[i].imie + "\nNazwisko : " + majstry[i].nazwisko + "\nWiek : " + majstry[i].wiek + "\n");
        }
    }
    public static class pracownik{
        String imie;
        String nazwisko;
        int wiek;
    }
}

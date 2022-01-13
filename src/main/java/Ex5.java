public class Ex5 {
    public static void main(String[] args) {
        char a = 'a';
        int b = a;
        char c = 101;
        int charNum = Character.getNumericValue(c);

        System.out.println("Wyniki : \na : " + a + "\nb : " + b + "\nc : " + c + "\ncharNum : " + charNum);
    }
}

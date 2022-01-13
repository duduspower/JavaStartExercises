import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość elementów : ");

        int n = in.nextInt();
        int [] array = new int[n];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        System.out.println("\n");

        for(int j = 0; j < array.length; j++){
            if(j == array.length - 1) {
                System.out.print(array[j]);
            }
            else {
                System.out.print(array[j] + ",");
            }
        }
    }
}

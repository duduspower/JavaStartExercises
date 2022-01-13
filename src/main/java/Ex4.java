import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj a : ");
        int a = in.nextInt();

        System.out.println("Podaj b : ");
        int b = in.nextInt();

        System.out.println("");

        if(a == b){
            System.out.println("A jest równe B");
        }
        else if(a > b){
            System.out.println("A jest większe od B");
        }
        else{
            System.out.println("A jest mniejsze od B");
        }
    }
}

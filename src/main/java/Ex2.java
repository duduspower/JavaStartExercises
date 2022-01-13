public class Ex2 {
    public static void main(String[] args) {
        int age = 18;
        boolean pelnoletni = true;
        String name = "Dominik";
        String surname = "Duda";
        double iq = 100.01;
        float speed = 23.4f;

        System.out.println("Profile : \nName : " + name + "\nSurname : " + surname + "\nAge : " + age + "\nIQ : " + iq + "\nSpeed : " + speed);

        String a = "Lubię";
        String b = "placki";
        String c = "bo :";
        String str = a + b + c;

        System.out.println("String : " + str);

        System.out.println("Substracted String : " + str.substring(0,11));

    }
}

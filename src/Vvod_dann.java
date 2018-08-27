import java.util.Scanner;

public class Vvod_dann {
    public static void main(String[] args) {
        User tolya = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite svoi name: ");
        tolya.name = scanner.nextLine();
        System.out.println("Vvedite svoi vozrast: ");
        tolya.age = scanner.nextInt();

        int itog = tolya.doPencii();
        if (itog < 0) {
            System.out.println(tolya.name + ", Vi na pencii");
        } else {
            System.out.println(tolya.name + ", Vam do pencii " + itog);
        }
    }
}

class User{
    String name;
    int age;

    int doPencii() {
        int realPencia;
        realPencia = 65 - age;
        return realPencia;
    }
}
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value;
        do {
            System.out.println("vvedi 5");
            value = s.nextInt();
        }while (value !=5);
        System.out.println("Vi vveli 5, yra!");
    }
}

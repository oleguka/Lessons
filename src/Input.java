import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        System.out.println("vvedite chislo");
        double x = s.nextDouble();
        System.out.println("vi vveli " + x);
    }
}

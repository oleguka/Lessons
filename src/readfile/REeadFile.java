package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class REeadFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = "C:" + separator + "Users" + separator + "Oleg" + separator + "Desktop" +separator + "New.txt";

        File file = new File("test2");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int countesr = 0;

        for (String number : numbersString) {
            numbers[countesr++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}

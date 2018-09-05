package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("test2");
        Scanner scanner = new Scanner(file);
    }
}

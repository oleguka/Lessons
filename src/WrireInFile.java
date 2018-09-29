import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WrireInFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hi");
        pw.println("World");

        pw.close();
    }
}

import java.io.File;

public class DeliteFiles {
    public static void main(String[] args) {
        File dir = new File("C://Users/Oleg/Desktop/Files");
        String name = new String("txt.txt");

        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " \t byte " + item.length() + " \t folder");
                } else {
                    System.out.println(item.getName() + " \t byte " + item.length() + " \t file");
                    if (name.contains(item.getName())) {
                        item.delete();
                    }
                }
            }
        }
    }
}

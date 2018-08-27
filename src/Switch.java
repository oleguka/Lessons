import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi vozrast");
        String age = scanner.nextLine();
        switch (age) {
            case "nyl" :
                System.out.println("ti rodilso");
                break;
            case "seven" :
                System.out.println("ti poshel v shkoly");
                break;
            case "18" :
                System.out.println("ti zakonchil use");
                break;
            default:
                System.out.println("nochego ne podoshlo");
        }

    }
}

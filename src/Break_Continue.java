public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("vishli iz cikla");

        for (int k = 0; k < 15; k++) {
            if (k % 2 == 0) {
                continue;
            }
            System.out.println("eto ne chetnoe chislo " + k);
        }
    }
}

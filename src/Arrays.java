public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        char character = 'a';
        String s = "Hello";
        String s1 = new String("Hello");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
    }
}
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        int x = 5;
        String[] animals = {"Hasky", "Morz "};
        String[] food = {"kolbacy", "korz "};

        String result1 = animals[0].concat(" est ").concat(food[0]);
        String result2 = animals[1].concat(" est ").concat(food[1]);
        String result3 = new String();
        String array = "It's array simbols";

        char ch = array.charAt(6);
        System.out.println(ch);

        int art = result1.length();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result2.concat(result3));
        System.out.println(art);

        String str = "1000 000 00 0 0";
        char[] chArray = str.toCharArray();
        for (int i =0; i < chArray.length; i++) {
            if (chArray[i] == ' ') {
                chArray[i] = '.';
            }
        }
        System.out.println(chArray);

        String s = "olegulka";
        String name = s.substring(2, s.length()-2);
        System.out.println(name);

        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");
        System.out.println(isbnParts[0]);
        System.out.println(isbnParts[2]);
        System.out.println(isbnParts[3]);
        System.out.println(isbnParts[4]);

        String goblin = "www.olegulka.com";
        boolean isCintains = goblin.endsWith("com");
        System.out.println(isCintains);

        String newStr = str.replace(" ", "-");
        System.out.println(newStr);
    }
}

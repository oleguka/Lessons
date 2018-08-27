public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("fsf", 55);
        human1.setName("Tom");
        Human human2 = new Human("Tola", 67);
        Human.description = "Nice";
        Human.getDescription();
        human1.getAllField();
        human2.getAllField();
        Human.countPeople();
    }
}

class Human {
    private String name;
    private int age;
    public static  String description;
    private static int countPeople;

    public Human() {
        this.name = "default";
        this.age = 0;
        System.out.println("Hello, it's first constructor");
    }

    public Human(String name) {
        System.out.println("Vtoroi constructor");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("It's 3 constr");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void  getAllField() {
        System.out.println(name + age + description);
    }

    public static void countPeople() {
        System.out.println(countPeople);
    }

}

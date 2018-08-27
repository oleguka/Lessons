public class ThisClass {
    public static void main(String[] args) {
        Human1 human = new Human1();
        human.setAge(18);
        human.setName("Tom");
        human.getInfo();

    }
}

class Human1 {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + age);
    }

}
package Polymorf;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        Animal animal2 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal2);
        test(cat);
        test(dog);
    }

    public static void test(Animal animal) {
        animal.eat();

    }
}

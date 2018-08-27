public class Dog extends Animal {
    public void bark() {
        System.out.println("I AM BARKING");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleap() {
        System.out.println("Dog sleeping");
    }

    public void showName() {
        System.out.println(name);
    }
}

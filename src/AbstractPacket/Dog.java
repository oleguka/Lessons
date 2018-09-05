package AbstractPacket;

public class Dog extends Animal implements Run{
    int speed;
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

}


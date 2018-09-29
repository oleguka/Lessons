package Lesson43;

public class Electrocar {
    private  int id;
    //вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id +  " is starting...");
        }
    }
    //Вложенный статический класс - часть класса
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charching...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " + id + " id starting...");

        final int x = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

    }
}

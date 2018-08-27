public class Class_and_object {
    public static void main(String[] args) {
        Person Oleg = new Person();
        Oleg.setName("Svetic");
        Oleg.setAge(45);

        System.out.println("My name " + Oleg.getName() + " and my age: " + Oleg.getAge());

        Person person2 = new Person();

        System.out.println("My name " + person2.getName() + " and my age: " + person2.getAge());

        Person person3 = new Person();


        //Действия (методы)
        Oleg.speak();
        person2.sayHello();
        person2.speak();
        int year1 = person2.calculateYearsTo();
        System.out.println(year1);

        person3.setName("Nikola");
        double itog = person3.zarplata();
        System.out.println(person3.getName() + " have zarplata " + itog);

    }
}

class Person {
    //Данные
    private String name;
    private int age;
    private int stavka;



    //Действия (методы)
    void speak() {
        System.out.println("My name " + name + " and my age: " + age);
    }

    void sayHello() {
        System.out.println("Hello");
    }

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("pustoe ima");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0 ) {
            System.out.println("vozrast dolzen bit > 0");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setStavka(int usetStavka) {
        stavka = usetStavka;
    }

    public int getStavka() {
        return stavka;
    }

    int calculateYearsTo() {
        int years = 65 - age;
        return years;
    }

    double zarplata() {
        double zp = stavka*0.98;
        return zp;
    }
}

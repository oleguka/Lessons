package Lesson28;

//public, private, default, protected(доступны в пределах одного пакета, доступны всем подклассам, даже если они вне пакета)

import Lesson28.Packet1.Person;

public class Test extends Person{

    public int id;
    public Test() {
        name = "Tom";
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "rte";



    }
}

package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Oleg"), new Person(2, "Mike"), new Person(3, "Drack")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            oos.writeObject(people);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

package Serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "people.bin";
        File file = new File(path);
        Person[] people = {new Person(1, "Bob"), new Person(2, "Leon"), new Person(3, "Saimon")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(people);
        } catch (IOException e) {
            System.out.println("Error while writing");
        }
    }
}

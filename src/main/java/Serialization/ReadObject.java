package Serialization;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "CodeMaster" + separator + "JavaMarathon2021" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "people.bin";
        File file = new File(path);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error while reading file");
        } catch (ClassNotFoundException e) {
            System.out.println("Required class not found");
        }
    }
}

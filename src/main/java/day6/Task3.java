package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Geography", "Лупа Валерий Альбертович");
        Student s = new Student("Пупа Геннадий Петрович");
        t.evaluate(s);
    }
}

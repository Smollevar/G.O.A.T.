package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Привет Максим", "ОГР_12_1");
        Teacher teacher = new Teacher("Селиванов Иван Егорович", "ИЗО");
        System.out.println("Учебная группа студента: " + student.getGroupName());
        System.out.println("Предмет преподавателя: " + teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}

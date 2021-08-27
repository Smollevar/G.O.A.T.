package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student std = new Student("Gennadii", "PBO-16-2");
        Teacher teach = new Teacher("Sergei","Philosophy");
        System.out.println(std.getGroupName());
        System.out.println(teach.getSubjectName());
        std.printInfo();
        teach.printInfo();
    }
}


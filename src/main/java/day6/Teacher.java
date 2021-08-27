package day6;

import java.util.Random;

public class Teacher {
    private String subject;
    private String name;
    Random ran = new Random();

    public Teacher(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void evaluate(Student student) {
        int eva = ran.nextInt(4) + 2;
        String trueevaluate = null;
        switch (eva) {
            case 5:
                trueevaluate = "Отлично";
                break;
            case 4:
                trueevaluate = "Хорошо";
                break;
            case 3:
                trueevaluate = "Удовлетворительно";
                break;
            case 2:
                trueevaluate = "Неудовлетворительно";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + subject + " на оценку " + trueevaluate);
    }
}


package day9.Task1;

public class Student extends Human {
    private String GroupName;

    public Student(String name, String groupName) {
        super(name);
        this.GroupName = groupName;
    }

    public String getGroupName() {
        return GroupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем: " + name);
    }
}

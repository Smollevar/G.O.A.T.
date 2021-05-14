package day6;

class Car {
    private int yearOfIssue;
    private String Color;
    private String Mod;

    public void setYearOfIssue(int yearOfIssue){this.yearOfIssue = yearOfIssue;}
    public int getYearOfIssue(){return yearOfIssue;}
    public void setColor(String Color){this.Color = Color;}
    public String getColor(){return Color;}

public void setMod (String Mod){this.Mod = Mod;}
public String getMod () {return Mod;}
void info () {System.out.println("Это автомобиль");}
    int yearDifference (int inputYear){
    if(yearOfIssue>inputYear) System.out.println("Ошибка ввода");//Дубль коммента с класса мотоцикл
    int yeard = inputYear - yearOfIssue; return yeard;
}
}
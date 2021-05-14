package day6;

class Motorcycle {
    private int yearOfIssue;
    private String Color;
    private String Mod;

public Motorcycle(int yearOfIssue, String Color, String Mod){
    this.yearOfIssue=yearOfIssue;
    this.Color= Color;
    this.Mod=Mod;
}
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public String getColor(){
    return Color;
    }
    public String getMod(){
    return Mod;
    }

    void info (){System.out.println("Это мотоцикл");}

    int yearDifference (int inputYear){if(yearOfIssue>inputYear){ System.out.println("Ошибка ввода");}/*
    Тут не совсем понятно, для прерывания операции после ошибки ввода должен ставиться break, но среда ругается на break
    ... Или я что-то забыл...
    */
        int yeard = inputYear - yearOfIssue;
        return yeard;
    }
}
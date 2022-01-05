package com.company;

public class Empl implements Salary{
    int hours;
    int pay;
    int cash;
    ;
    public Empl(int hours, int pay) {
        this.hours = hours;
        this.pay = pay;
        cash = hours * pay;
    }

    @Override
    public void Salary() {
        System.out.println("Зарплата за 12 год ="+ cash +"$");
    }
}

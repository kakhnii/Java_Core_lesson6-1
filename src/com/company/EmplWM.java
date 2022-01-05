package com.company;

public class EmplWM implements Salary {
    int month;
    int money;
    int cash;

    public EmplWM(int month, int money) {
        this.month = month;
        this.money = money;
        cash = month * money;
    }

    @Override
    public void Salary() {
        System.out.println("Фіксована зарплата працівника ="+ cash +"$");
    }
}

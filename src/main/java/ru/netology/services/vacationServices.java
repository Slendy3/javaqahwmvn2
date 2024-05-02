package ru.netology.services;


public class vacationServices {
    public int calculate(int income, int expenses, int threshold) {
        int vacation = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                vacation++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;

            }
        }
        return vacation;
    }
}
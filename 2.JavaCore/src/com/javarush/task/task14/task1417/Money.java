package com.javarush.task.task14.task1417;

public abstract class Money {
    public Money(double amount) {
    }
    private double amount;

    public double getAmount() {
        return amount;
    }

    //public abstract double getAmount();

    public abstract String getCurrencyName();
}


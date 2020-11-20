package com.company;

public class Customer {
    private String  INN;
    private String name;
    int money;

    public Customer(String INN, String name, int money) {
        this.INN = INN;
        this.name = name;
        this.money = money;
    }

    public String  getINN() {
        return INN;
    }

    public String getFIO() {
        return name;
    }
}
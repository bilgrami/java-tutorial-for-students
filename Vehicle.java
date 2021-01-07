// package com.corp.learning ;

public abstract class Vehicle {
    String owner = "None";
    int year;
    String maker = "";

    abstract void moveTo(int a, int b);

    // abstract class constructor
    public Vehicle() {

    };

    public Vehicle(String owner, int year) {
        this.owner = owner;
        this.year = year;
    }
}
// package com.corp.learning ;

public abstract class Vehicle {
    String owner = "None";
    int year;
    String maker = "";
    static int total_vehicle_count = 0;
    int total_move_count = 0;

    abstract void moveTo(int a, int b);

    public static void print_stats() {
        System.out.println("Total Vehicle: " + String.valueOf(Vehicle.total_vehicle_count) );
    }
    // abstract class constructor
    public Vehicle(String owner, int year) {
        this.owner = owner;
        this.year = year;
        total_vehicle_count++;
    }
}
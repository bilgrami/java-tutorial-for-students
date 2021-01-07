// package com.corp.learning ;

// import Vehicle;

public class HybridVehicle extends Vehicle {
    Boolean is_hybrid;

    public HybridVehicle(String owner, int year) {
        super(owner, year);
        this.is_hybrid = true;
    }

    public void moveTo(int a, int b) {
        System.out.println(String.format("Hello " + this.owner + ", We are moving from " + String.valueOf(a) + " to "
                + String.valueOf(b) + "."));
    }
}

// package com.corp.learning ;

// import Vehicle;

public class HybridVehicle extends Vehicle {
    Boolean is_hybrid;

    public HybridVehicle(String owner, int year) {
        super(owner, year);
        this.maker = " Hybrid Vehicle";
        this.is_hybrid = true;
        System.out.println("Hello " + this.owner + ", you own a " + this.maker);
    }

    public void print_move_stats() {
        System.out.println("Total Movements: " + String.valueOf(total_move_count) );
    }

    public void moveTo(int a, int b) {
        total_move_count++;
        System.out.println(String.format("Hello " + this.owner + ". Move ID: [" + String.valueOf(total_move_count) + "] Moving from " + String.valueOf(a) + " to "
                + String.valueOf(b) + "."));

    }
}

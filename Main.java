// package com.corp.learning;
// import com.corp.learning.Vehicle;
// import com.corp.learning.HybridVehicle;
/*
Goal:
 - Show usage of implementing abstract methods
 - Show usage of static variable
 - Show usage of static method
 - Define an interface
 - Implement an interface, and show its usage 
 - Composition of objects 
 - Polymorphism
*/
// import HybridVehicle;

// public class Prius  extends HybridVehicle {
public class Main  extends HybridVehicle {

    Boolean is_hybrid;

    public Main(String owner, int year) {
        super(owner, year);
        // check arguments
        if (owner == "Syed") {
            owner += "Sir ";
        }
        this.maker = "Toyota";
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Main my_prius = new Main("Syed Bilgrami", 2019);
        println("Hello " + my_prius.owner + ", you own a " + my_prius.maker);
        my_prius.moveTo(10, 20);
    }
}
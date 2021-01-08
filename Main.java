/*
- Track total vehicles (count all objects)
- Track Total movements for each vehicle 
- Track total movements across all vehicle 

Goal:
 - Show usage of implementing abstract methods
 - Show usage of static variable
 - Show usage of static method

 - Define an interface
 - Implement an interface, and show its usage 
 - Composition of objects 
 - Polymorphism
*/

// public class Prius  extends HybridVehicle {
public class Main  extends HybridVehicle {

    Boolean is_hybrid;

    public Main(String owner, int year) {
        super (owner, year);
        // // check arguments
        // if (owner == "Syed Bilgrami") {
        //     this.owner = "Sir " + this.owner;
        // }
        this.maker = "Toyota";
    }

    public static void main(String[] args) {
        Main p1 = new Main("Syed Bilgrami", 2019);
        p1.moveTo(10, 20);
        p1.moveTo(30, 40);
        Main.print_stats();
        Main p2 = new Main("Shaheer", 2021);

        p2.moveTo(5, 6);
        p1.moveTo(7, 8);

        Main.print_stats();


    }
}
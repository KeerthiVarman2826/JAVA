package Day8;
class Vehical{
    String brand;
    int year;
    void StartEngine(){

    }
}
class Car extends Vehical{
    String fueltype;
    void startEngine(){
        System.out.println("Car engine starts");
    }
    void Drive(){
        System.out.println("Car is driving");
    }

}
class Truck extends Vehical{
    int loadCapacity;
    void startEngine(){
        System.out.println("Truck engine start");
    }
    void haul(){
        System.out.println("Truck is hauling");
    }

}


public class InheritancePratice1 {
    public static void main (String []args){
        Car c1 = new Car();
        c1.brand = "TATA";
        c1.year = 2008;
        c1.fueltype="desal";
        c1.startEngine();
        c1.Drive();
        Truck t1 = new Truck();
        t1.brand = "mahendhara";
        t1.year = 2010;
        t1.loadCapacity= 40;
        t1.startEngine();
        t1.haul();

    }
    
}

package Day9;
abstract class vehical{
    abstract void Speed();
    void Speed1(){
        System.out.println("25km/h");
    }
}
class Bike extends vehical{
 void Speed(){
    System.out.println("45km/h");
 }
}
class car extends vehical{
    void Speed(){

    }
}

public class Abstract {
    public static void main(){
        car c1 = new car();
        c1.Speed1();
    }
    
}

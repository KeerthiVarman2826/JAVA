package Day7;
// This is single inheritance 
// super class
class Animals{
    void eat(){
        System.out.println("This animals can eat");
    }
}
// trived class
class dog extends Animals{
    void bark(){
        System.out.println("Barks");
    }
}

public class SingleInheritance {
    public static void main (String []args){
        dog d1 = new dog();
        d1.bark();
        d1.eat();

    }
    
}

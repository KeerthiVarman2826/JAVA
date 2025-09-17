package Day7;

class Animal{
    void eat(){
        System.out.println("This animal can eat");
    }
}
class dog extends Animals{
    void bark(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.meow();
        c1.eat();
        // c1.bark();
        dog d1 = new dog();
        d1.bark();
        d1.eat();
        // d1.meow();
        
    }
    
}

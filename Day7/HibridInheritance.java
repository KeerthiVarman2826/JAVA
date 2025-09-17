package Day7;

class Animal{
    void eat(){
        System.out.println("This animal can eat");
    }
}
class dog extends Animal{
    void bark (){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    
    }
}
class puppy extends dog{
    void weeps(){
        System.out.println("Puppy weepa");
    }
}

public class HibridInheritance {
    public static void main(String[] args) {
        puppy p1 = new puppy();
        p1.weeps();
        p1.bark();
        p1.eat();
        cat c1 = new cat();
        c1.meow();
        c1.eat();
        
    }
    
}

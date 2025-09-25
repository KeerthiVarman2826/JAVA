package Day9;

class Animal{
    Animal(){
        System.out.println("Animals");
    }
    int age = 12;
    
   void makeSound(){
    System.out.println("Animal make a sound");
   }
}
class Dog extends Animal{
    Dog(){
    super();
    super.makeSound();    
    System.out.println("Dog");
    System.out.println(super.age);
    }

}

public class SuperKey {
    public static void main(String[]args){
        Dog d1 = new Dog();

    }
    
}

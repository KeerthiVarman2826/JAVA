package Day8;
class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal make a sound");
    }
}
class Dog extends Animal{
    String breed;
    void makeSound(){
        System.out.println("Dog barks");
    }
    void fetch(){
        System.out.println("Dog is fetchimg");
    }

}
class cat extends Animal{
    String color;
    void makeSound(){
        System.out.println("Cat is meows");
    }
    void climb(){
        System.out.println("Cat is climbing");
    }

}

public class InheritancePratice {
    public static void main(String[]args){
        // Animal a1 = new Animal();
        // a1.makeSound();
        // a1.name="xyz";
        // a1.age=5;
        // System.out.println(a1.name);
        Dog d1= new Dog();
        d1.name ="timmy";
        d1.age = 2;
        d1.breed ="Gloden";
        System.out.println(d1.name);
        d1.makeSound();
        d1.fetch();
        cat c1 = new cat();
        c1.name = "pinky";
        c1.age = 3;
        c1.color ="red";
        c1.makeSound();
        c1.climb();
    }
    
}

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
    class puppy extends dog{
        void weeps(){
        System.out.println("puppy weeps");
        }
    }
   


public class multiLevelInheritance {
    public static void main(String[]args){
        puppy p1 = new puppy();
        p1.weeps();
        p1.bark();
        p1.eat();

    }
    
}

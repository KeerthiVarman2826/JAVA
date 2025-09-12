package Day4;

public class maths {
    int a =10;
    int b =20;
    int c=30;
    void sum(){
        System.out.println(a+b+c);
    }
    void sub(){
        System.out.println(a+b-c);
    }
    void mul(){
        System.out.println(a*b*c);
    }
    void div(){
        System.out.println(b/a);
    }
    public static void main(String []args){
        maths obj1 = new maths();
        obj1.sum();
        obj1.sub();
        obj1.mul();
        obj1.div();
    }
    
}

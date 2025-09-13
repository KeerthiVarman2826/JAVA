package Day5;

public class AdditionParameter {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);

    }
    void mul(int a,int b){
        System.out.println(a*b);

    }
    void div(int a,int b){
        System.out.println(a/b);

    }
    public static void main(String[]args){
        AdditionParameter obj1 = new AdditionParameter();
        obj1.sum(10,20);
        obj1.sub(20,5);
        obj1.mul(10,10);
        obj1.div(10,2);
    }
    
}

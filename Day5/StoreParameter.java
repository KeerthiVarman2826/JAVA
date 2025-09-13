package Day5;

public class StoreParameter {
    void getsoap(int a){
        System.out.println(a);
        System.out.println("sope parchased");
    }
    void pouder(int a){
        System.out.println(a);
        System.out.println("pouder parchased");
    }
    void shampoo(int a){
        System.out.println(a);
        System.out.println("shampoo parchased");
    }
    public static void main(String [] args){
        StoreParameter obj1 = new StoreParameter();
        obj1.getsoap(20);
        obj1.pouder(50);
        obj1.shampoo(10);

    }
    
}

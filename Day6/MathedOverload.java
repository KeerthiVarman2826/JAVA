package Day6;

public class MathedOverload {
    void sum(int a,int b){
        System.out.println(a+b);

    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        MathedOverload obj1 = new MathedOverload();
        obj1.sum(20,12,5);
        obj1.sum(40,18);
    }
    
}

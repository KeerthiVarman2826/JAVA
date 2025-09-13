package Day5;

public class Sumreturn {
    int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[]args){
        Sumreturn obj1 = new Sumreturn();
        int sum1 =obj1.sum(20,12);
        System.out.println(sum1);
    }
    
}

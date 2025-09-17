package Day7;

class Dad{
    int money=2000;

}
class Son extends Dad{

}
public class Inheritence {
    public static void main (String[]args){
        Dad d1 = new Dad();
        System.out.println(d1.money);
        Son s1 = new Son();
        System.out.println(s1.money);

    }
    
}

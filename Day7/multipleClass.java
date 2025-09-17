package Day7;
class laptop{
    String name;
}
class bike{
    int price = 10;
}

public class multipleClass {
    public static void main(String[] args) {
        laptop t1 = new laptop();
         t1.name ="hp";
         System.out.println(t1.name);
         laptop t2 = new laptop();
         t2.name ="dell";
         System.out.println(t2.name);
         bike b1 =new bike();
         System.out.println(b1.price);

          }
    
}

package Day3;

public class ClassLaptop {
    String name = "";
    String proc = "";
    int price =0;
    int ram =0;
    int storage =0;
    public static void main(String [] args){
        ClassLaptop lap1 = new ClassLaptop();
        lap1.name="Hp";
        lap1.proc="i3";
        lap1.price=45000;
        lap1.ram= 6;
        lap1.storage=128;

        ClassLaptop lap2 = new ClassLaptop();
        lap2.name ="lenova";
        lap2.proc ="i5";
        lap2.price=50000;
        lap2.ram=8;
        lap2.storage=128;

        ClassLaptop lap3 = new ClassLaptop();
        lap3.name="acer";
        lap3.proc = "i7";
        lap3.price=75000;
        lap3.ram = 8;
        lap3.storage=264;
        System.out.println(lap2.price);
        System.out.println(lap3.name);
        System.out.println(lap1.proc);

    }
    
}

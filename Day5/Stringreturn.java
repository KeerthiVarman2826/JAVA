package Day5;

public class Stringreturn {
    String getname(){
        String str ="keerthi";
        return str;


    }int getphone(){
        int a= 80983683;
        return a;

    }
    public static void main(String [] args){
        Stringreturn obj1 = new Stringreturn();
        String name=obj1.getname();
        int a = obj1.getphone();
        System.out.println(a);
        System.out.println(name);
    }
    
}

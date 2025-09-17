package Day7;

public class ThisKey {
    String myname;
   ThisKey(){
        System.out.println("Hello");
    }
    void setname(String myname){
       this.myname=myname;

    }

    public static void main(String[]args){
        ThisKey obj1 = new ThisKey();
        obj1.setname("mark");
        System.out.println(obj1.myname);
    }
    
}

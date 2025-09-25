package Day9;
class teacher{
    private String t_name = "keerthi";
    void display(){
        System.out.println(t_name);
    }
}
public class Access {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        // System.out.println(t1.t_name);
         t1.display();
        
    }
    
}

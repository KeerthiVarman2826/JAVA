package Day6;
import java.util.*;
public class School {
    String passorfail(int a){
        if(a>=45){
            // System.out.println("Pass");
             return "pass";
        } else{
            return "fail";
        }
       
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        School obj1 = new School();
        String result = obj1.passorfail(mark);
        System.out.println(result);

    }
    
}

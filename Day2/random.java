package Day2;
//Generate a rondom number until the number generated random number is 5
import java.util.Random;
public class random {
    public static void main(String[]args){
        Random sc =new Random();
          int num=0;
          while(num!=5){
           num = sc.nextInt(11);
        System.out.println(num);

         }
        
      
        
    }
    
}

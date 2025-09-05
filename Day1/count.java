package Day1;
import java.util.*;

public class count {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int number =scan.nextInt();
        int count=0;
        for(int i=0;i<=number;i++){
            if(i%2!=0){
                count+=1;
                System.out.println(i);
            }
            
        }
    System.out.println("count the number:"+count);
    }
    
}


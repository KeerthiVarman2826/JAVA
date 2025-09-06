package Day2;
import java.util.*;

public class middel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int mark[]=new int[number];
        for(int i=0;i<=number-1;i++){
            mark[i]=scan.nextInt();
             
        }
        if(number%2==0){
            System.out.println(mark[number/2-1]+" "+mark[number/2]);
        }
        else{
            System.out.println(mark[number/2]);
        }
          
        }
    }
    


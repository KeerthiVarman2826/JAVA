package Day2;

import java.util.Scanner;

/*public class Demo {
    public static void main(String[]args){
        int i;
        for(i=1;i<=10;i++)
        System.out.println("keerthi");
    }
    
}
*/
/*public class Demo {
    public static void main(String []args){
        int i=10;
       for(i=1;i<=10;i++)
       System.out.println(i);

    }
}*/
/*class demo {
    public static void main(String[] args) {
        int i=10;
        for( i=10;i>=1;i--)
        System.out.println(i);
    }
}*/

/*class demo{
    public static void main (String[]args){
     Scanner k = new Scanner(System.in);
        int a=k.nextInt();
         int b=k.nextInt();
         //System.out.println(a +"and"+ b);
         for(int i=a;i<=b;i++)
         System.out.println(i);
    }
}*/
/*class demo{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        if( i%2==0){
            System.out.println("the number is even:"+i);
        }
        else{
            System.out.println("the number is odd:"+i);
        }
    }
}*/
class demo{
    public static void main (String[]args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int count = 0;
       for(int i=0;i<=a;i+=2){
            count += 1;
       }
       System.out.println("Even count :"+" "+count);
       
         count = 0;
       for(int i=1;i<=a;i+=2){
        count +=1;
       }
       System.out.println("Odd Count:"+" "+count);

    }
}
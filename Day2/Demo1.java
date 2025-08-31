import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n>=0 && n<=100) {
    System.out.println("Input out of bond, Re Enter Again");
     n = sc.nextInt();
    }
    for(int i=1;i<=n;i++){
        if (i%3==0 && i%5 ==0) {
            System.out.println("Elements are"+" "+i);
        }
    }
    
}
}
package Day1;
//print the rever 
/*public class Revers {
    public static void main(String[] args) {
        int num =143;
        int rev=0;
        while(num>0){
            int k =num%10;
            rev =(rev*10)+k;
            num/=10;
        }
        System.out.println(rev);
    }*/
    
//}
//check tha polindrom 
class demo{
    public static void main(String[] args) {
        int num =141;
        int temp=num;
        int rev = 0;
        while(num>0){
            int n =num%10;
            rev=(rev*10)+n;
            num/=10;
        }
        if(rev==temp){
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}


package Day2;

public class mid {
    public static void main(String[] args) {
        int num =23456;
        String s=String.valueOf(num);
        int len =s.length();
        if(len%2==0){
            System.out.println(s.charAt(len/2-1)+" "+s.charAt(len/2));
        }else{
            System.out.println(s.charAt(len/2));
        }
    }
    
}

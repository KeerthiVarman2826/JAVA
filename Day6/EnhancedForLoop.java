package Day6;

public class EnhancedForLoop {
    public static void main(String[]args){
        int num[] ={10,20,30,40,50};
        // for(int i=0;i<5;i++){
        //     System.out.println(num[i]);
        // }
        for(int var:num){
            System.out.println(var);
        }
    }
    
}

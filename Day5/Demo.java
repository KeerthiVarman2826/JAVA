package Day5;

/*public class Demo {
    public static void main(String[]args){
        for(int i=0;i<=10;i++){
            System.out.println(i+"x2="+i*2);
        }
    }

    
}*/
/*import java.util.Scanner;
class Demo{
    public static void main(String[]args){
        Scanner k =new Scanner(System.in);
        int size=k.nextInt();
        int mark[]=new int[size];
        for(int i=0;i<=size-1;i++){
            mark[i]=k.nextInt();
        
        }
        int s=size/2;
     System.out.println(mark[s]);
    }
}*/
import java.util.*;
class demo{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int marks[]=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=scan.nextInt();
        }
        for(int x=0;x<size;x++){
            for(int j=1;j<size;j++){
                if(marks[x]>marks[j]){
                    int temp=marks[x];
                    marks[x]=marks[j];
                    marks[j]=temp;
                }
            }
           
        }
        
       for(int a=0;a<size;a++){
        System.out.print(marks[a]+" ");
       }
       scan.close(); 
}
}

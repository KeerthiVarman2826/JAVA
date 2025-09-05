package Day1;

import java.util.*;
public class ArrayAsc{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int marks[]=new int[number];
        for(int i=0;i<number;i++){
            marks[i]=scan.nextInt();
        }

        // for(int i=0;i<number;i++){
        //     for(int j=i+1;j<number;j++){
        //         if(marks[i]>marks[j]){
        //             int temp=marks[i];
        //             marks[i]=marks[j];
        //             marks[j]=temp;
        //         }
        //     }
        // }
        // for(int k=0;k<number;k++){
        //     System.out.print(marks[k]+" ");
        // }
        Arrays.sort(marks);
        // for(int i=0;i<number;i++){
        //     System.out.print(marks[i]+" ");

        // }
        for(int i=number-1;i>=0;i--){
            System.out.print(marks[i]+" ");
        }
        }

 }
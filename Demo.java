import java.util.Scanner;

//class Demo{
   /*  public static void main(String[] args) {
      String Name="keerthi";
      int Age=18;
      System.out.println(Name);
      System.out.println(Age);
    }
    public static void main(String[] args){
      String Name="keerthi";
      int Age=18;
      String Address="villupuram (dic) theppirampattu";
      System.out.println("the name is"+Name);
    }*/
    /*public static void main(String[] args) {
      Scanner k =new Scanner(System.in);
      String Name=k.nextLine();
      int Age=k.nextInt();
      k.nextLine();
      String Address=k.nextLine();
      System.out.println("The name is "+Name);
      System.out.println("The age is "+Age);
      System.out.println("The address is "+Address);

    }*/
    /*public static void main(String[] args) {
      int a,b,c;
      a=2;b=3;c=4;
      int e=a+b+c;
      int d=a*b*c;
      System.out.println(d);
      System.out.println(e);
    }*/
   /* public static void main(String[] args) {
      boolean rain=false;
      if (rain) {
        System.out.println("take the uumbrella");
      }
      else{
          System.out.println("enjoy the sun light");
        }
      
    } */
   /*public static void main(String[] args){
    int num1=30;
    int num2=50;
    if(num1>num2){
    System.out.println("the number 1 is greater");
    }
else{
  System.out.println("the number 2 is greater");
}*/
/*public static void main(String[] args){
  int num1=40;
  int num2=60;
  if(num1==num2){
    System.out.print("the both number is equal");
    
  }else{
    System.out.println("the both number is not eequal ");
  }
}

    
}*/
/*class Demo{
  public static void main (String[] args){
    Scanner k=new Scanner(System.in);
    int num1= k.nextInt();
    int num2=k.nextInt();
    if(num1==num2){
      System.out.println("the both numer is equal");
    }else{
      System.out.println("the both number is not equal");
    }
  }
}*/
/*class Demo{
  public static void main(String[]args){
    Scanner k=new Scanner(System.in);
    String RCB=k.nextLine();
    if(RCB.equals( "win")){
    System.out.println("Ea sala cup amdhey");
    }else{
     System.out.println("No cup");
    }
  }
}*/
/*class demo{
public static void main(String[]args){
  Scanner k =new Scanner (System.in);
  int mark =k.nextInt();
  if(mark>=35){
    System.out.println("pass");

  }else{
    System.out.println("fail");
  }
}
}*/
/*class demo{
  public static void main (String[]args){
    int num=15;
    if (num%5==0&&num%3==0) {
      System.out.println("yes");
      
    }else{
      System.out.println("no");
    }
    
  }
}*/
/*class demo{
public static void main(String[]args){
  Scanner scan=new Scanner(System.in);
  int num= scan.nextInt();
  if(num%2==0){
    System.out.println("the number is even");
  }else{
    System.out.println("the number is odd");
  }
}
}*/
/*class demo{
  public static void main(String[]args){
  int score=99;
  if(score>35&&score<60){
    System.out.println("vodeo game");
  }else if(score>60&&score<90){
    System.out.println("iphone");
  }else if(score>90){
    System.out.println("macbook pro");
  }
  }
}
*/
/*class demo{
  public static void main(String[]args){
    int score=54;
    if(score<50){
      System.out. println("You need to improve");
    }
    else if(score>=50 && score<=70){
      System.out.println("Goog job");
    }
    else if(score>70){
      System.out.println("Excellent performance");
    }
  }
}*/
/*class demo{
  public static void main (String[]args){
    Scanner k =new Scanner(System.in);
    int sub1=k.nextInt();
    //char ch=k.next().charAt(0);
    int sub2=k.nextInt();
    int sub3=k.nextInt();
    int sub4=k.nextInt();
int sub5=k.nextInt();
int sub6=(sub1+sub2+sub3+sub4+sub5)/5;
System.out.println(sub6);
if(sub6<35){
  System.out.println("Additional class is required");
}
else{
  System.out.println("you are good to go");
}

  }
}*/
/*  class demo {
  public static void main(String[]args){
    String color="yello";
    if(color.equals("red")){
      System.out.println("stop");
    }else if(color.equals("yello")){
      System.out.println("Get ready");
    }else if(color.equals("green")){
      System.out.println("Go");
    }
  }
 *class demo {
  public static void main(String[]args){
    boolean rain =true ;
    String result=rain ?"Take the umbrella":"enjoy the sunlight";
    System.out.println(result);
  }
}*/
public class Demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    boolean flag= false;
    String res = (a>b) ?"a is greater"+" "+ a :"b is greater"+" "+b;
    System.out.println(res);

  }
}


    

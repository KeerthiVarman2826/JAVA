package Day9;
class Teacher {
     private  int salary = 1000;
     void display(){
        System.out.println(salary);
     }
     
}

public class Student {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        // System.out.println(t1.salary);
        t1.display();
    }
    
}

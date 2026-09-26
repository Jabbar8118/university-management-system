
package university.management.system;


public class Student {
    int roll;
    String name;
    
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public String toString(){
        return "ROLL NO : "+roll+" "+"NAME :"+name;
        
        
    }
}

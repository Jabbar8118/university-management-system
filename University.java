
package university.management.system;

import java.util.ArrayList;

public class University {
    String name;
    ArrayList <Department> dept;
    University(String name,ArrayList <Department> dept){
        this.name=name;
        this.dept=dept;
    }
public String toString(){
        return "UNIVERSITY :"+name+" "+dept;
        
        }
   
  
     
}

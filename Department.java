
package university.management.system;

import java.util.ArrayList;


public class Department {
    ArrayList <Student> std;
    ArrayList <Course> co;
    ArrayList <Teacher> tch;
    String name;
    Department(String name , ArrayList <Student> std, ArrayList <Course> co, ArrayList <Teacher> tch){
        this.name=name;
        this.std=std;
        
        this.co=co;
        this.tch=tch;
        
    }
    public String toString(){
        return "DEPARTMENT :"+name+" "+std+" "+co+" "+tch;
    }
    
}

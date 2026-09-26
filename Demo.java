
package university.management.system;

import java.util.ArrayList;

public class Demo {
      public static void main(String[] args) {
      Student s1 = new Student(123,"ali");
      ArrayList<Student> std = new ArrayList<Student>();
      std.add(s1);
      System.out.println(s1);
          
      Course c1 = new Course("OOP");
      ArrayList<Course> co = new ArrayList<Course>();
      co.add(c1);
      System.out.println(c1);
      
      Teacher t1 = new Teacher(35000.00);
      ArrayList<Teacher> tch = new ArrayList<Teacher>();
      tch.add(t1);
      System.out.println(t1);
      
      Department d1 = new Department("Computer Science", std , co , tch);
      ArrayList<Department> dept = new ArrayList<Department>();
       dept.add(d1);
          System.out.println(d1);
      University u1 = new University("COMSATS", dept);
     
          System.out.println(u1);
      
      
    }
}

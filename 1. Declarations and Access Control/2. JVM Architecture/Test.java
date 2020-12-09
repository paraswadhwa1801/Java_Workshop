// A Java program to demonstrate working of a Class type 
// object created by JVM to represent .class file in 
// memory. 
import java.lang.reflect.Field; 
import java.lang.reflect.Method; 

public class Test {

	public static void main(String[] args) 
    { 
        Student s1 = new Student(); 
  
        // Getting hold of Class object created 
        // by JVM. 
        Class c1 = s1.getClass(); 
  
        // Printing type of object using c1. 
        System.out.println("CLass Name: "+c1.getName()); 
  
        // getting all methods in an array 
        Method m[] = c1.getDeclaredMethods(); 
        for (Method method : m) 
            System.out.println("Method Name: "+method.getName()+"()"); 
  
        // getting all fields in an array 
        Field f[] = c1.getDeclaredFields(); 
        for (Field field : f) 
            System.out.println("Field Name: "+field.getName()); 

        // Let's check if all the objects of Student class point to the same object of Class (java.lang)
        Student s2 = new Student();
        Class c2 = s2.getClass();
        System.out.println("Does c1 and c2 point to the same Class object? ");
        System.out.println(c1==c2);
    } 
}

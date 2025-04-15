
package javaapp;
class Student
{
    int age=55;
    String name="smith";
void read()
{
System.out.println("reading");
}
}


public class Obj {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println("program starts");
        System.out.println(s.age);
        System.out.println(s.name);
        s.read();
        System.out.println("program ends");
    }
    
}


package javaapp;
class Person
{
    void human(){
        System.out.println("he is human");
    }
}
class Walk extends Person{
    void disp()
    {
        System.out.println("executing walk");
        
    }
}
class Run extends Person
{
    void show()
    {
        System.out.println("executing run");
    }
}
public class HiericheralInheritance {
    public static void main(String[] args)
    {
        Walk wa=new Walk();
        wa.human();
        wa.disp();
        Run r=new Run();
        r.human();
        r.show();
    }
    
}

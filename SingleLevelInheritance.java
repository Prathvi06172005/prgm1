
package javaapp;
class Beta{
    void print()
    {
        System.out.println("Executing print....");
    }
}
class Gama extends Beta{
    
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Gama g=new Gama();
        g.print();
    }
    
}


package javaapp;

public class Constructor1 {
    int capacity;
    //parametrized constuctor
    Constructor1(int a)
    {
        capacity=a;
    }
    public static void main(String[] args) {
        Constructor1 c=new Constructor1(500);
        System.out.println(c.capacity);
        Constructor1 c1=new Constructor1(1500);
        System.out.println(c1.capacity);
        Constructor1 c2=new Constructor1(1400);
        System.out.println(c2.capacity);
    }
}
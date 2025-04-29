
package MethodOverload;
class Hotel{
    void eat(int a)
    {
        System.out.println("dosa");
    }
    void eat(double b)
    {
        System.out.println("idly");
    }
    void eat(char c)
    {
        System.out.println("vada");
    }
}
public class Type {

    public static void main(String[] args) {
       Hotel h=new Hotel();
       h.eat(10);
       h.eat(67.8);
       h.eat('b');
    }
    
}


package MethodOverload;
class City{
    void place(int a)
    {
        System.out.println("Karanataka");
    }
    void place(int a,int b)
    {
        System.out.println("udupi");
    }
    void place(int a,int b,int c)
    {
        System.out.println("pune");
    }
}

public class Length 
{

    public static void main(String[] args) 
    {
        City c=new City();
        c.place(10);
        c.place(30,80);
        c.place(99,89,77);
    }
    
}

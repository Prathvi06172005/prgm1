
package MethodOverload;
class Game {
    void play(String name,int a)
    {
        System.out.println("cricket");
    }
    void play(int a,String name)
    {
        System.out.println("Football");
    }
        
}
public class Sequence {

  
    public static void main(String[] args)
    {
        Game g=new Game();
        g.play("ABD",17);
        g.play(8,"Ronaldo");
        
    }
    
}

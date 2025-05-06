
package Absrtct;
abstract class Hostar
{
    void login()
    {
        System.out.println("login successfull");
    }
    abstract void watch();
}
class Hostarfree extends Hostar{
    void watch(){
        System.out.println("watch with ads");
    }
}
class HostarPremium extends Hostar{
    void watch(){
        System.out.println("watch without ads");
    }
}

public class HostarMain {

    public static void main(String[] args) {
         Hostarfree hf=new  Hostarfree();
         HostarPremium  hp=new HostarPremium ();
         hf.login();
         hf.watch();
         
         hp.login();
         hp.watch();
    }
}
         
  
   

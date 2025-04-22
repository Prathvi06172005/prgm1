
package javaapp;
class WhatsappV1{
    void chat()
    {
        System.out.println("texting..");
    }
}
class WhatsappV2 extends WhatsappV1{
    void calling(){
        System.out.println("voice/video calling");
        
    }
}
class WhatsappV3 extends WhatsappV2{
    void status()
    {
        System.out.println("status for best friend ");
        
    }
}
public class MultiLevelInheritance {
  public static void main(String[] args) {
       WhatsappV3 wh=new WhatsappV3();
       wh.chat();
       wh.calling();
       wh.status();
    
    }
}

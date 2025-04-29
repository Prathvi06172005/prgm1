
package MethodOverload;
class Amazon
{
    void payment(){
        System.out.println("cod");
    }
    void payment(String name)
    {
        System.out.println("upi");
    }
    void payment(long cardno,int password)
    {
        System.out.println("card");
    }
    void payment(String username,String password)
    {
        System.out.println("net banking");
    }
}


public class MethodLoverLoding {

    public static void main(String[] args) {
        Amazon a=new Amazon();
        a.payment();
        a.payment("Hlo");
        a.payment(908978655,987);
        a.payment("abcd","ytr");
       
    }
    
}

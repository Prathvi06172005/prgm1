
package MethodOverload;
class Irctc{
    void search(int Trainnumber)
    {
        System.out.println("particular train details");
    }
    void search(String src,String des)
    {
        System.out.println("source to destination");
    }
    void serach(long pnr)
    {
        System.out.println("all detail of train");
    }
}
public class MethodRidde {
    public static void main(String[] args) {
        Irctc c=new Irctc();
        c.search(896);
        c.search("udupi","mumbai");
        c.serach(9766589);
        
        
    }
    
}

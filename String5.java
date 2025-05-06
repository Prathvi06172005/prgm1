
package Strings;

public class String5 {

  
    public static void main(String[] args)
    {
        String cars="kia,bmw,benz";
        String [] s=cars.split(",");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        
    }
    
}

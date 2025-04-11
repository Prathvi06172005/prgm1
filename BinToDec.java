
package Array;
import java.math.*;
public class BinToDec {

    
    public static void main(String[] args) {
        int n=1010;
        int rem=0;
        int sum=0;
        int i=0;
        int base=2;
        while(n>0)
        {
            rem=n%10;
            sum= (int)(sum+rem*Math.pow(base,i));
            i++;
            n=n/10;
            
        }
        System.out.println("sum is:"+ sum);
    }
}
        
        
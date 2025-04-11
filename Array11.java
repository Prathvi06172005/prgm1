
package Array;


public class Array11 {

    public static void main(String[] args) {
        int n=12345;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            System.out.print(rem);
            n=n/10;
        }
    }
    
}

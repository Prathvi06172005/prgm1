
package Array;
public class Array8 {
    public static void main(String[] args) {
        int[]arr={21,22,23,24,25};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }
        System.out.println("even count:" + evencount);
        System.out.println("odd count:" + oddcount);
    }
    
}
     
 
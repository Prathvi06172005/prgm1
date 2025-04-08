package Array;

public class Array6 {
    public static void main(String[] args) {
        int[] n={5,7,8,9,3};
        int min=n[0];
        
        for(int i=1;i<n.length;i++)
        {
            if(min>n[i])
            {
                min=n[i];
            }
        }
        System.out.println(min);
    }
    
}
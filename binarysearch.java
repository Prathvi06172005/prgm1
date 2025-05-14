
package java128;

public class binarysearch {
    int binarysearch(int[] arr,int l,int r,int ele)
    {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==ele)
            {
                return mid;
            }
            else if(arr[mid]<ele)
            {
                l=mid-1;
            }
            else if(arr[mid]>ele)
            {
                r=mid-1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
       int [] arr={5,9,17,23,25,45,59,63,71,89};
       int l=0;
       int ele=59;
       int r=arr.length-1;
       binarysearch b=new binarysearch();
       int res=b.binarysearch(arr,0,9,59);
       if(res!=-1)
       {
           System.out.println("Element found");
       }
       else
       {
           System.out.println("element not found");
       }
    }
    
}

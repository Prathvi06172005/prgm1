
package Strings;

public class String2 {

    public static void main(String[] args) {
       String s1="java";
       String s2="Java";
       System.out.println(s1.equals(s2));
       System.out.println(s1.equalsIgnoreCase(s2));
       char [] arr=s1.toCharArray();
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
           
       }
       System.out.println(s1.indexOf('a'));
       System.out.println(s1.lastIndexOf('a'));
    }
    
}

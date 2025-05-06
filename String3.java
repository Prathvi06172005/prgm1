
package Strings;

public class String3 {

    public static void main(String[] args) {
       String s1="java developer";
       String s2="Java Tester";
       System.out.println(s1.contains("ava"));
       System.out.println(s1.contains(s2));
       System.out.println(s1.startsWith("java"));
       System.out.println(s1.startsWith("Java"));
       System.out.println(s2.endsWith("developer"));
       System.out.println(s1.endsWith("per"));
    }
    
}

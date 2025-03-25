
package javaclass;

public class Prg16 {
    public static void main(String[] args) {
        int age=24;
        if(age<12)
        {
            System.out.println("minor ticket");
        }
        else if(age>=13 && age<=60)
        {
            System.out.println("normal ticket");
        }
        else if(age>=60)
        {
            System.out.println("senior ticket");
        }
        else
        {
            System.out.println("ok");
        }
    }
}
        

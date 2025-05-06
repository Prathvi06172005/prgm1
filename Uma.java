
package Interface;

public class Uma implements Person{
    @Override
    public void eat(){
        System.out.println("uma eating");
    }
    public static void main(String[]args){
        Uma u=new Uma();
        System.out.println(u.age);
        u.eat();
    }
}

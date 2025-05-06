
package Interface;


public class Training extends Bepratical implements Jpratical,Tpratical{
    @Override
    public void javaTraining(){
        System.out.println("trainingg ");
    }
    public void testTraining(){
        System.out.println("training manually and pratically");
    }
    public  static void main(String[]args){
        Training t=new Training();
        t.training();
        t.javaTraining();
        t.testTraining();
    }
}
    
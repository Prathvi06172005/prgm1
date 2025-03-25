
package javaclass;
public class Prg24 {
    public static void main(String[] args) {
        char ch='a';
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(ch+" ");
                ch++;
            }
            ch='a';
            System.out.println();
        }
    }
}

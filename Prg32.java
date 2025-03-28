package javaclass;
//wit arugment and with return type
public class Prg32 {
    static int sq(int a){
        return a*a;
    }
    static int cb(int b){
        int ans=b*b*b;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("program starts");
        System.out.println(sq(2));
        System.out.println(cb(3));
        System.out.println("programs ends");
    }
    
}

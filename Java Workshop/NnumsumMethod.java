import java.util.Scanner;

class NNSM{
    private int x, s=0;
    public void pack(){
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
    }
    public void process(){
        s=(x*(x+1))/2;
    }
    public void provide(){
        System.out.println(s);
    }
}
public class NnumsumMethod {
    public static void main(String[] args) {
        NNSM pass = new NNSM();
        pass.pack();
        pass.process();
        pass.provide();
    }
}

import java.util.Scanner;

class SM{
    private int a,b;
    public static int c;
    public void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public int sumNum(){
        c=a+b;
        return c;

    }
}
public class sumMethod {
    public static void main(String[] args) {
        SM call = new SM();
        call.takeInput();
        call.sumNum();
        System.out.println(SM.c);
    }
}

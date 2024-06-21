import java.util.Scanner;

class EOM{
    private int x;
    public static boolean y;
    public int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        x=sc.nextInt();
        return x;
    }
    public boolean evenOdd() {
        if (x % 2 == 0) {
            y = true;
        }
        return y;
    }
}
public class evenoddMethod {
    public static void main(String[] args) {
        EOM call = new EOM();
        call.input();
        call.evenOdd();
        if(EOM.y==true)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

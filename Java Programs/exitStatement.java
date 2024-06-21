import java.util.Scanner;
public class exitStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 or 1");
        int x = sc.nextInt();
        if(x==0)
            System.out.println("Hello");
        else if (x==1) {
            System.exit(0);
        }
        else
            System.out.println("Invalid");
    }
}

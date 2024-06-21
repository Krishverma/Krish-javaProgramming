import java.util.Scanner;

public class switchCaseeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch=sc.nextInt();
        int a=10,b=20;
        switch (ch){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Value of ch");
        }
    }
}

import java.util.Scanner;

public class CalCulator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Choose According to The Options");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Product");
        System.out.println("4. Quotient");
        System.out.println("5. Remainder");
        System.out.println("Enter your Choice : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Sum " + (a + b));
                break;
            case 2:
                System.out.println("Diffrence " + (a - b));
                break;
            case 3:
                System.out.println("Product " + (a * b));
                break;
            case 4:
                System.out.println("Quotient " + (a / b));
                break;
            case 5:
                System.out.println("Remainder " + (a % b));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}


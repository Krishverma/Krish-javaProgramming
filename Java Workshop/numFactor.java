import java.util.Scanner;

public class numFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int x = sc.nextInt();
        int a =1;
        for(int i=1 ; i<=x ; i++){
            a=a*i;
        }
        System.out.println("Factorial is "+a);
    }
}
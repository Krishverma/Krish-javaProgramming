import java.util.Scanner;

public class checkPrimeUseBool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int n = sc.nextInt();
        if(n<1)
            System.out.println("Invalid Number");
        else {
            for(int i = 2;i<=n/2;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true) {
                if(n==1)
                    System.out.println("Neither Prime nor Composite");
                System.out.println("Prime Number");

            }
            else
                System.out.println("Not Prime");
        }
    }
}

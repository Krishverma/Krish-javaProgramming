import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Natural Number");
        int n = sc.nextInt();
        int count =0;
        if(n<1)
            System.out.println("Invalid Number");
        else {
            for(int i=2;i<=n/2;i++){
                if(n%i==0) {
                    count++;
                    break;
                }
            }
            if(count==0) {
                if (n == 1)
                    System.out.println("Neither Prime nor Composite");
                System.out.println("Number is Prime");
            }
            else
                System.out.println("Not Prime");
        }
    }
}

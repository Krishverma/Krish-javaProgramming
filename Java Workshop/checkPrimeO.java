import java.util.Scanner;
public class checkPrimeO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int counter =0;
        for (int i=1;i<=n;i++){
            if(n%i==0)
                counter++;
        }
        if(counter==2) //Because it will be 1 automatically since every no. divides by 1 in for loop i = 1
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
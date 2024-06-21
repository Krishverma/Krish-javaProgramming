import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.print(0+" ");
        System.out.print(1+" ");
        for (int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}

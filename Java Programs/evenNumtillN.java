import java.util.Scanner;

public class evenNumtillN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int x = sc.nextInt();
        int i = 1;
        while(i<=x){
            if(i % 2 == 0)
                System.out.print(i+" ");
            i++;
        }
    }
}

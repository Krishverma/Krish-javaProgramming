import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        System.out.println("Enter Any Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x+" X "+i+" = "+(x*i));
        }
    }
}

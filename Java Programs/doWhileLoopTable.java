import java.util.Scanner;

public class doWhileLoopTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number ");
        int x = sc.nextInt();
        int i = 1;
        do{
            System.out.println(x+" X "+i+" = "+(x*i));
            i++;
        }while (i<11);

    }
}

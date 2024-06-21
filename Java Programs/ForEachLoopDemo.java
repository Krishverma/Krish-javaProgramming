import java.util.Scanner;
public class ForEachLoopDemo {
    public static void main(String ar[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter rows and cols");
        int x[][] = {{1,2,3,4},{3,4,5,6},{1,2,3,4}};
        for(int a[]:x){
            for(int b:a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}

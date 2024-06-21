import java.util.Scanner;
public class sumOFnNaturalNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Natural Number");
        int x = sc.nextInt();
        int sum =0;
        if(x<0)
            System.out.println("Invalid Number");
        else{
            for(int i =0;i<=x;i++){
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}

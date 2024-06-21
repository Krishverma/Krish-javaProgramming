import java.util.Scanner;
public class anonymousInnerClassDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=10,b=0;
        int n=5;
        int arr[] = new int[5];
        for(int i=0 ; i<5 ; i++){
            arr[i]=sc.nextInt();
        }
        int c=1;
        try{
            c=a/b;
            System.out.println(arr[7]);
        }catch(ArithmeticException e){
            c=a/2;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Not Present In Array");
        }
    }
}
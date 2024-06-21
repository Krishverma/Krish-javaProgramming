import java.util.Scanner;

public class arrayDemoMethod {
    public static int f(int ar1[], int n){
        int sum =0;
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]>0 && ar1[i]%2 !=0){
                sum=sum+ar1[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int c =f(arr,s);
        System.out.println(c);
    }
}

import java.util.Scanner;

public class demoPointerConcept {
    public static void demoMethod(int arr[], int n){
        arr[0]=arr[0]+1;
        n+=1;
        System.out.println("In Method "+arr[0]+" "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int n=3;
        for(int i =0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        demoMethod(arr,3);
        System.out.println("After Method "+arr[0]+" "+ n);
    }
}

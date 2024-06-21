import java.util.Scanner;
class CPM{
    private static int x;
    private static int j = (int) Math.sqrt(x);
    public void pack(){
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
    }
    public static boolean process(){
        for(int i=2;i<=j;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void provide(){
        if(process()){
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}
public class primeMethod {
    public static void main(String[] args) {
        CPM pass = new CPM();
        pass.pack();
        pass.process();
        pass.provide();
    }
}

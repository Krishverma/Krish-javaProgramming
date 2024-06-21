import java.util.Scanner;

class AVGM{
    private int a,b,c;
    private double avg;
    public void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers (Space Seperated)");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }
    public void average(){
        avg = (a+b+c)/3;
    }
    public void display(){
        System.out.println(avg);
    }

}
public class avgnumMethod {
    public static void main(String[] args) {
        AVGM call = new AVGM();
        call.takeInput();
        call.average();
        call.display();
    }
}

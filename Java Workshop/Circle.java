import java.util.Scanner;
public class Circle {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle ");
        int r = sc.nextInt();
        double pi = 3.14;
        double circum = 2*pi*r;
        double area = pi*r*r;
        System.out.println("Circumference of The Circle "+circum);
        System.out.println("Area of the Circle "+area);

    }
}

import java.util.Scanner;

/*Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/
public class loopsMarksDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to Exit & 1 to Continue");
        int x = sc.nextInt();
        switch (x){
            case 0:
                System.exit(0);
            case 1:
                System.out.println("Enter Marks");
                int m = sc.nextInt();
                if(m>100 || m<0)
                    System.out.println("Invalid");
                else {
                    if(m>=90 && m<=100)
                        System.out.println("This is Good");
                    else if (m<=89 && m>=60) {
                        System.out.println("This is Also Good");
                    }
                    else if (m<=59 && m>=0) {
                        System.out.println("This is Good as Well");
                    }
                }
                break;
            default:
                System.out.println("Invalid Number Entered");

        }
    }
}

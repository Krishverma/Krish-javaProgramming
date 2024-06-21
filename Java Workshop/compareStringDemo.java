import java.util.Scanner;

public class compareStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        if(s.length()!=s1.length()){
            System.out.println("Not Equal");
        }
        else {
            int f = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s1.charAt(i)) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("Equal");
            }
            else {
                System.out.println("Not Equal");
            }
        }
    }
}

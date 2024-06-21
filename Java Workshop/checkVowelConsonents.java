import java.util.Scanner;

public class checkVowelConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        int v=0,c=0;
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println(v+" "+c);
    }
}

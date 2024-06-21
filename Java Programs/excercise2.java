//You work in pairs in the computer lab. Play a prank with your partner and swap the marks entered for him with yours. Remember, you can only use 2 variables, else you'll get caught.
//        Example -
//        Input: a = 24, b = 43
//        Output: a = 43, = 24

package javaApp;

import java.util.Scanner;

public class excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of First Person: ");
        int x = sc.nextInt();
        System.out.print("Enter marks of Second Person: ");
        int y = sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);

    }
}

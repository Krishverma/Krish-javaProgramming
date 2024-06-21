//Make an invitation to a birthday party at your place. Input your friend's name and print the message :
//        "Hey <friendName>, it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!! "
//        Example -
//        Input: Tom
//        Output: Hey Tom, it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!
package javaApp;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        String msg = ", it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!";
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hey "+name+msg);
    }
}

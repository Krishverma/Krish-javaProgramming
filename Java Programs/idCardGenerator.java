//Problem Statement: Write a Java program that will take user input and print his Name, Age, Blood Group, and also his Group to which he belongs in the school.
//
//        Approach:
//
//        Write the code for user input
//        Initialise class Scanner
//Ask for Student’s name and store it in a String variable
//        Ask for Student’s age and store it in the Integer variable
//        Ask for Student’s blood group and store it in a String variable
//        Once you have got all user inputs, it’s time to decide the group to which the student belongs to. Let's divide the students into three groups: RED, BLUE, and YELLOW. A group for a student is decided based on his age.
//        RED: If the age of a student is greater than or equal to 20 then he belongs to the RED group
//        BLUE: If the age of a student is greater than or equal to 15 but smaller than 20 then he belongs to the BLUE group.
//        YELLOW: If the age of a student is greater than or equal to 10 but smaller than 15 then he belongs to the YELLOW group
//        You need to use IF-ELSE-IF Ladder statements to decide the group for the student based on his age.
//
//        Once you have got all the attributes such as name, age, blood group, and group name, you need to print out the Student ID Card that should look similar to the desired output.

import java.util.Scanner;

public class idCardGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Blood Group: ");
        String bloodGroup = scanner.next();
        String group = "";
        if(age>=20){
            group = "RED";
        }
        else if(age>=15 && age<20){
            group = "BLUE";
        }
        else if (age>=10 && age<15) {
            group = "YELLOW";
        }
        System.out.println("---------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Blood Group: "+bloodGroup);
        System.out.println("---------------------");
        System.out.println("Your group is "+group);
        System.out.println("---------------------");
    }
}

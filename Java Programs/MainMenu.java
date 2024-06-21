import java.util.Scanner;
class MainMenu{
	public static void main(String ar[]){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter two numbers for processing ");
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println("Enter your Choice Number")
		System.out.println("Number 1 for Odd/Even")
		System.out.println("Number 2 for Positive/Negative")
		System.out.println("Number 3 for Swapping")
		System.out.println("Number 4 for Exit")
		switch(c){
		case 1:
			if(a%2==0 && b%2==0){
				System.out.println("Both are Even");
			}
			else if(a%2==0 && b%2!=0){
				System.out.println(a+" is Even and "+b+" is Odd");
			}
			else if(a%2!=0 && b%2==0){
				System.out.println(a+" is Odd and "+b+" is Even");
			}
			else{
				System.out.println("Both are Odd");
			}
			break;
		case 2:
			if(a>0 && b>0){
				System.out.println("Both are Positive")
			}
			else if(a>0 && b<0){
				System.out.println(a+" is Positive and "+b+" is Negative")
			}
			else if(a<0 && b>0){
				System.out.println(a+" is Negative and "+b+" is Positive")
			}
		}
	}
}
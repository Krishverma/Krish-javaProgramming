import java.util.Scanner;
class GreaterNum{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Two Numbers ");
		int a = s1.nextInt();
		int b = s1.nextInt();
		if(a>b){
			System.out.println(a+" is Greater");
		}
		else if(b>a){
			System.out.println(b+" is Greater");
		}
		else{
			System.out.println("Numbers are Equal")
		}
	}
}
import java.util.Scanner;
class SearchArray{
	public static void main(String[] ar){
		int x[] = new int [5];
		int f=0;
		Scanner s1 = Scanner(System.in); 
		System.out.println("Enter Array");
		for(i=0;i<x.length;i++){
			x[i]=s1.nextInt()
		}
		System.out.println("Enter element to search")
		int a = s1.nextInt()
		for(i=0;i<x.length;i++){
			if(a==x[i]){
				f=1;
				break;
			}
		}
		if(f==0)
				System.out.println("Element not Founded")
		else{
				System.out.println("Element Not Found")
			}
		
	}
}
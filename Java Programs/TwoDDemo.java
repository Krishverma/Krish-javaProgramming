import java.util.Scanner;
class TwoDDemo {
    public static void main(String ar[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter no of rows and cols");
        int row=s1.nextInt();
        int col=s1.nextInt();
        int x[][]=new int[row][col];
        System.out.println("Enter matix");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                x[i][j]=s1.nextInt();

        System.out.println("Entered matix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }


    }
}

import java.util.Scanner;
class MatrixOperation {
    static Scanner s1=new Scanner(System.in);
    static void input(int x[][],int row1,int col1) {
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col1; j++)
                x[i][j] = s1.nextInt();
    }
    static  void show(int z[][],int row,int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
        static void sumMatrix(int x[][],int y[][],int z[][],int row,int col){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    z[i][j]=x[i][j]+y[i][j];
                }

            }
        }



        public static void main(String ar[]){

            System.out.println("Enter number of rows and cols of first Matrix");
            int row1 = s1.nextInt();
            int col1 = s1.nextInt();
            System.out.println("Enter number of rows and cols of second Matrix");
            int row2 = s1.nextInt();
            int col2 = s1.nextInt();
            if(row1!=row2||col1!=col2)
                System.out.println("Sum of matrix is not possible");
            else {
                int x[][]=new int[row1][col1];
                int y[][]=new int[row2][col2];
                int z[][]=new int[row1][col1];
                System.out.println("Enter first matrix");
                input(x, row1, col1);
                System.out.println("Enter second matrix");
                input(y, row2, col2);

                sumMatrix(x, y, z, row1, col1);

                System.out.println("First matrix is");
                show(x, row1, col1);
                System.out.println("Second matrix is");
                show(y, row1, col1);
                System.out.println("Sum of  matrix is");
                show(z, row1, col1);
            }


    }
}

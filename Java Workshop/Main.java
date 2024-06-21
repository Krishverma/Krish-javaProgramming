import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Input the discount percentage
            int discountPercentage = scanner.nextInt();

            // Calculate the amount to pay
            double sellingPrice = 100.0; // Selling price of the toy
            double amountToPay = sellingPrice - (sellingPrice * (discountPercentage / 100.0));

            // Print the result
            System.out.println((int) amountToPay);
        }

        scanner.close();
    }
}
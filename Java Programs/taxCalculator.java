import java.util.Scanner;

public class taxCalculator {
    static void calculateTax(String name, long income){
        long tax = 0;
        if(income >= 300000){
            tax = income/5;
        } else if (income >= 100000 && income < 300000) {
            tax = income/10;
        } else if (income < 100000 && income > 0) {
            tax = 0;
        }
        System.out.println(name+" : "+tax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tax Calculating App");
        System.out.println("------Welcome------");
        System.out.println("Enter Total Person Count: ");
        int person = sc.nextInt();
        String names[] = new String[person];
        long incomes[] = new long[person];
        for(int i = 0 ; i < person ; i++){
            System.out.println("Enter Name "+(i+1)+" :");
            names[i] = sc.next();
            System.out.println("Enter Income of Name "+(i+1)+" :");
            incomes[i] = sc.nextInt();
        }
        for (int i = 0 ; i < person ; i++){
            calculateTax(names[i],incomes[i]);
        }
    }
}

public class prgm {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer as a command line argument.");
            return;
        }

        String input = args[0];
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char digitChar = input.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
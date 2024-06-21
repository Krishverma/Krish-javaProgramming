public class stringPrgm1 {
    public static void main(String[] args) {
        String str = "hello, world!";

        // Remove spaces and convert the string to lowercase
        str = str.replaceAll(" ", "").toLowerCase();
        System.out.println(str);
        char maxChar = 0;
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCount[c]++;
            if (charCount[c] > charCount[maxChar]) {
                maxChar = c;
            }
        }

        System.out.println("The maximum occurring character is: " + maxChar);
    }
}

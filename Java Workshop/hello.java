import java.util.*;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int distinctCount = countDistinct(arr);
        System.out.println(distinctCount);
    }

    public static int countDistinct(int[] arr) {
        Set<Integer> distinctSet = new HashSet<>();
        for (int num : arr) {
            distinctSet.add(num);
        }
        return distinctSet.size();
    }
}
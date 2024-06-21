//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < size; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        scanner.close();
//        int distinctCount = countDistinct(arr);
//        System.out.println("Number of distinct integers: " + distinctCount);
//    }
//
//    public static int countDistinct(int[] arr) {
//        Set<Integer> distinctSet = new HashSet<>();
//        for (int num : arr) {
//            distinctSet.add(num);
//        }
//        return distinctSet.size();
//    }
//}
import java.util.Scanner;
import java.util.Arrays;

public class SearchingAlgorithms {

    // Linear Search
    static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (arr[mid] < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int linearResult = linearSearch(arr, key);

        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        System.out.println("Sorted array: " + Arrays.toString(sortedArr));

        int binaryResult = binarySearch(sortedArr, key);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at sorted index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found");
        }

        sc.close();
    }
}

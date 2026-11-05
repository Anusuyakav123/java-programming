import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        sc.close();
    }
}

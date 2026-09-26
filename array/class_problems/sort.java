import java.util.Scanner;

public class sort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Create result array
        int[] result = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        // Main logic
        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            }
            else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of arr1
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        // Output
        System.out.print("Merged array: ");

        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }

        sc.close();
    }
}
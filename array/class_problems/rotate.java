import java.util.Scanner;

public class rotate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Reduce k
        k = k % n;

        // Create new array
        int[] newArray = new int[n];

        // Main logic
        for (int i = 0; i < n; i++) {

            int newPosition = (i + k) % n;

            newArray[newPosition] = nums[i];
        }

        // Output
        System.out.print("Rotated array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(newArray[i] + " ");
        }

        sc.close();
    }
}
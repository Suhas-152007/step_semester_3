import java.util.Scanner;

public class element {

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

        // Main logic
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println("Contains duplicate: true");
                    return;
                }
            }
        }

        // Output if no duplicate is found
        System.out.println("Contains duplicate: false");

        sc.close();
    }
}
import java.util.Scanner;

public class day {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Main logic
        int lowestPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            // Find the profit if we sell today
            int profit = prices[i] - lowestPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // Update lowest price
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
        }

        // Output
        System.out.println("Maximum profit is: " + maxProfit);

        sc.close();
    }
}
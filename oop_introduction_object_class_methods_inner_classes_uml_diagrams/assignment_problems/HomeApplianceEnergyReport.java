import java.util.Scanner;

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");

            String appliance = input[0];
            double hours = Double.parseDouble(input[1]);
            boolean saver = input.length == 3 &&
                            input[2].equals("SAVER");

            double power = 0;

            if (appliance.equals("FRIDGE")) {
                power = 150;
            } else if (appliance.equals("AC")) {
                power = 1500;
            } else if (appliance.equals("TV")) {
                power = 100;
            } else if (appliance.equals("WASHER")) {
                power = 500;
            }

            if (saver && !appliance.equals("AC")
                    && !appliance.equals("WASHER")) {
                System.out.println(appliance + ": saver mode not supported");
                continue;
            }

            double units = (power * hours) / 1000;

            if (saver) {
                units = units * 0.75;
            }

            double cost = units * 8;

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                appliance, units, cost
            );

            totalCost += cost;
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}
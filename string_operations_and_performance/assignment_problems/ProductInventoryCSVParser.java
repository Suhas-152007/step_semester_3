import java.util.Scanner;

public class ProductInventoryCSVParser {

    static void parseInventoryRecord(String csvLine) {

        String[] details = csvLine.split(",");

        if (details.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Product: " + details[0]
                + " | SKU: " + details[1]
                + " | Qty: " + details[2]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product record: ");
        String csvLine = sc.nextLine();

        parseInventoryRecord(csvLine);

        sc.close();
    }
}
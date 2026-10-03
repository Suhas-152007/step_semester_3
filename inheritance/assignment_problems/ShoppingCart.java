
public class ShoppingCart {
    private String itemName;
    private double price;
    private int quantity;

    ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void showBill() {
        double total = price * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: Rs. " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Notebook", 50, 3);
        cart.showBill();
    }
}
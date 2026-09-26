class MessWallet {

    private double balance;

    MessWallet(double balance) {

        if (balance < 0) {
            System.out.println("Negative balance not allowed.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void topUp(double amount) {

        if (amount < 0) {
            System.out.println("Top-up amount cannot be negative.");
        } else {
            balance = balance + amount;
            System.out.println("Amount added successfully.");
        }
    }

    public void deduct(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Amount deducted successfully.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class MessWalletDemo {

    public static void main(String[] args) {

        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);
        wallet.deduct(150);

        System.out.println("Current Balance: " + wallet.getBalance());
    }
}
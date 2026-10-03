import java.util.*;

class Payment {
    double calculate(double amount) {
        return amount;
    }
}

class Card extends Payment {
    double calculate(double amount) {
        return amount + (amount * 0.02);
    }
}

class Wallet extends Payment {
    double calculate(double amount) {
        return amount + (amount * 0.01);
    }
}

class BankTransfer extends Payment {
    double calculate(double amount) {
        return amount;
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double amount = sc.nextDouble();

            Payment payment;

            if (type.equals("CARD")) {
                payment = new Card();
            } 
            else if (type.equals("WALLET")) {
                payment = new Wallet();
            } 
            else {
                payment = new BankTransfer();
            }

            double finalAmount = payment.calculate(amount);

            System.out.printf("%s: %.2f\n", type, finalAmount);

            total = total + finalAmount;
        }

        System.out.printf("Total: %.2f\n", total);
    }
}
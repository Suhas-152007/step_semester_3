
import java.util.Scanner;

abstract class Travel {
    double distance;
    final double bookingFee = 50;

    Travel(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class Bus extends Travel {
    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 2 + bookingFee;
    }
}

class Train extends Travel {
    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 1.5 + bookingFee;
    }
}

class Flight extends Travel {
    Flight(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 2500 + distance * 4 + bookingFee;
    }
}

public class TravelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Travel[] bookings = new Travel[n];
        String[] modes = new String[n];

        for (int i = 0; i < n; i++) {
            modes[i] = sc.next();
            double distance = sc.nextDouble();

            if (modes[i].equals("BUS")) {
                bookings[i] = new Bus(distance);
            } else if (modes[i].equals("TRAIN")) {
                bookings[i] = new Train(distance);
            } else if (modes[i].equals("FLIGHT")) {
                bookings[i] = new Flight(distance);
            }
        }

        for (int i = 0; i < n; i++) {
            double fare = bookings[i].calculateFare();
            System.out.printf("%s: %.2f%n", modes[i], fare);
        }

        sc.close();
    }
}
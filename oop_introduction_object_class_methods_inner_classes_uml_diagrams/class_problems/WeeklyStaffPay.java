
import java.util.Scanner;

abstract class Staff {
    String name;

    Staff(String name) {
        this.name = name;
    }

    abstract double calculatePay();
}

class FullTimeStaff extends Staff {
    double salary;

    FullTimeStaff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double calculatePay() {
        return salary;
    }
}

class HourlyStaff extends Staff {
    double hours, rate;

    HourlyStaff(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculatePay() {
        if (hours <= 40) {
            return hours * rate;
        } else {
            return 40 * rate + (hours - 40) * rate * 1.5;
        }
    }
}

class Intern extends Staff {
    double stipend;

    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    double calculatePay() {
        return stipend;
    }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Staff[] staffList = new Staff[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            if (type.equals("FULLTIME")) {
                double salary = sc.nextDouble();
                staffList[i] = new FullTimeStaff(name, salary);
            } else if (type.equals("HOURLY")) {
                double hours = sc.nextDouble();
                double rate = sc.nextDouble();
                staffList[i] = new HourlyStaff(name, hours, rate);
            } else if (type.equals("INTERN")) {
                double stipend = sc.nextDouble();
                staffList[i] = new Intern(name, stipend);
            }
        }

        for (Staff staff : staffList) {
            double pay = staff.calculatePay();
            System.out.printf("%s: %.2f%n", staff.name, pay);
            total += pay;
        }

        System.out.printf("Total Payroll: %.2f%n", total);
        sc.close();
    }
}
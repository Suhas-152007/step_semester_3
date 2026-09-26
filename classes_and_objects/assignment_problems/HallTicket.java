class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class HallTicketDemo {

    public static void main(String[] args) {

        HallTicket priya =
            new HallTicket("Priya", 0);

        // Both variables point to the same object
        HallTicket copy = priya;

        copy.seatNumber = 45;

        System.out.println(
            "Priya's seatNumber: " + priya.seatNumber
        );

        System.out.println(
            "copy == priya: " + (copy == priya)
        );

        // New and separate object
        HallTicket separate =
            new HallTicket("Priya", 45);

        System.out.println(
            "separate == priya: " + (separate == priya)
        );
    }
}
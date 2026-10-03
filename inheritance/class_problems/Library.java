import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class LibraryItem {

    String title;
    int days;

    LibraryItem(String title, int days) {
        this.title = title;
        this.days = days;
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(days);
    }
}

class Book extends LibraryItem {

    Book(String title) {
        super(title, 14);
    }
}

class DVD extends LibraryItem {

    DVD(String title) {
        super(title, 7);
    }
}

class Magazine extends LibraryItem {

    Magazine(String title) {
        super(title, 3);
    }
}

public class Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            String[] parts = line.split(" ", 2);

            String type = parts[0];
            String title = parts[1];

            // Remove quotes
            title = title.replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title);
            }
            else if (type.equals("DVD")) {
                item = new DVD(title);
            }
            else {
                item = new Magazine(title);
            }

            System.out.println(
                item.title + ": " +
                item.getDueDate().format(format)
            );
        }
    }
}
import java.util.*;

public class uc1{

    // Booking class
    static class Booking {
        int bookingId;
        String customerName;
        String roomType;

        Booking(int bookingId, String customerName, String roomType) {
            this.bookingId = bookingId;
            this.customerName = customerName;
            this.roomType = roomType;
        }

        void displayBooking() {
            System.out.println("Booking ID: " + bookingId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Room Type: " + roomType);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Queue<Booking> queue = new LinkedList<>();

        // Enqueue booking requests
        queue.add(new Booking(1, "Alice", "Single"));
        queue.add(new Booking(2, "Bob", "Double"));
        queue.add(new Booking(3, "Charlie", "Deluxe"));

        System.out.println("=== Booking Requests Queue ===\n");

        // Process queue (FIFO)
        while (!queue.isEmpty()) {
            System.out.println("Processing Booking:");
            Booking b = queue.remove(); // Dequeue
            b.displayBooking();
        }
    }
}
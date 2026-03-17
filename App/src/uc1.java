import java.util.*;

public class uc1 {

    // Room class
    static class Room {
        int roomId;
        String roomType;
        boolean isAvailable;

        Room(int roomId, String roomType) {
            this.roomId = roomId;
            this.roomType = roomType;
            this.isAvailable = true;
        }
    }

    // Booking class
    static class Booking {
        int bookingId;
        String customerName;
        String requestedType;

        Booking(int bookingId, String customerName, String requestedType) {
            this.bookingId = bookingId;
            this.customerName = customerName;
            this.requestedType = requestedType;
        }
    }

    // Method to allocate room
    public static void allocateRoom(Queue<Booking> queue, Room[] rooms) {

        while (!queue.isEmpty()) {

            Booking b = queue.poll(); // Dequeue
            boolean found = false;

            for (Room r : rooms) {
                if (r.isAvailable && r.roomType.equalsIgnoreCase(b.requestedType)) {
                    r.isAvailable = false;

                    System.out.println("Booking ID: " + b.bookingId +
                            " | Customer: " + b.customerName +
                            " | Allocated Room: " + r.roomId);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Booking ID: " + b.bookingId +
                        " | Customer: " + b.customerName +
                        " | Status: No Room Available");
            }
        }
    }

    public static void main(String[] args) {

        // Initialize rooms
        Room[] rooms = {
                new Room(101, "Single"),
                new Room(102, "Double"),
                new Room(103, "Deluxe"),
                new Room(104, "Single")
        };

        // Booking queue
        Queue<Booking> queue = new LinkedList<>();
        queue.add(new Booking(1, "Alice", "Single"));
        queue.add(new Booking(2, "Bob", "Double"));
        queue.add(new Booking(3, "Charlie", "Single"));
        queue.add(new Booking(4, "David", "Suite"));

        System.out.println("=== Room Allocation Service ===\n");

        // Call service method
        allocateRoom(queue, rooms);
    }
}
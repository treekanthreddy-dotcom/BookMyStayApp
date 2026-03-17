import java.util.Scanner;

public class uc1 {

    // Room class
    static class Room {
        int roomId;
        String roomType;
        double price;

        Room(int roomId, String roomType, double price) {
            this.roomId = roomId;
            this.roomType = roomType;
            this.price = price;
        }

        void displayRoom() {
            System.out.println("Room ID: " + roomId);
            System.out.println("Room Type: " + roomType);
            System.out.println("Price: ₹" + price);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined rooms
        Room[] rooms = {
                new Room(101, "Single", 1000),
                new Room(102, "Double", 2000),
                new Room(103, "Deluxe", 3000),
                new Room(104, "Single", 1200)
        };

        System.out.print("Enter room type to search: ");
        String searchType = sc.nextLine();

        boolean found = false;

        System.out.println("\n--- Search Results ---");

        // Search logic
        for (Room r : rooms) {
            if (r.roomType.equalsIgnoreCase(searchType)) {
                r.displayRoom();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No rooms found for given type.");
        }

        sc.close();
    }
}
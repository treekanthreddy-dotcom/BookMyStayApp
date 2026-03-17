public class uc1 {

    // Room class inside same file
    static class Room {
        int roomId;
        String roomType;
        double price;

        // Constructor
        Room(int roomId, String roomType, double price) {
            this.roomId = roomId;
            this.roomType = roomType;
            this.price = price;
        }

        // Display method
        void displayRoomDetails() {
            System.out.println("Room ID: " + roomId);
            System.out.println("Room Type: " + roomType);
            System.out.println("Price: ₹" + price);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Room Initialization ===");

        // Creating objects
        Room r1 = new Room(101, "Single", 1000);
        Room r2 = new Room(102, "Double", 2000);
        Room r3 = new Room(103, "Deluxe", 3000);

        // Display
        r1.displayRoomDetails();
        r2.displayRoomDetails();
        r3.displayRoomDetails();
    }
}
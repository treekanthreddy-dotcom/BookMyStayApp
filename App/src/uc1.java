import java.util.Scanner;

public class uc1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Hotel Booking App ===");

        // Input details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Type (Single/Double): ");
        String roomType = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        // Simple price logic
        int rate = 0;

        if (roomType.equalsIgnoreCase("Single")) {
            rate = 1000;
        } else if (roomType.equalsIgnoreCase("Double")) {
            rate = 2000;
        } else {
            System.out.println("Invalid Room Type!");
            return;
        }

        int total = rate * days;

        // Output booking details
        System.out.println("\n--- Booking Details ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Room Type: " + roomType);
        System.out.println("Days: " + days);
        System.out.println("Total Amount: ₹" + total);

        sc.close();
    }
}
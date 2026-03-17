public class uc1{

    // Version 3.0 class
    static class Item {
        int itemId;
        String itemName;
        int quantity;
        double price;

        // Constructor
        Item(int itemId, String itemName, int quantity, double price) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }

        // Method to display item details
        void displayItem() {
            System.out.println("Item ID: " + itemId);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: ₹" + price);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Inventory Setup ===");

        // Creating objects
        Item i1 = new Item(1, "Bedsheet", 10, 500);
        Item i2 = new Item(2, "Pillow", 20, 200);
        Item i3 = new Item(3, "Towel", 15, 150);

        // Display inventory
        i1.displayItem();
        i2.displayItem();
        i3.displayItem();
    }
}
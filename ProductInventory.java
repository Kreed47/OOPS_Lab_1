import java.util.HashMap;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);
        inventory.put(102, 45);
        inventory.remove(101);

        System.out.println("Final Inventory:");
        for (Integer productId : inventory.keySet()) {
            System.out.println("Product ID: " + productId + ", Quantity: " + inventory.get(productId));
        }
    }
}

// Problem 4: Singly Linked List - Inventory Management System
public class InventorySinglyLinkedList {
    static class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;
        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
        }
    }
    private Node head;
    public void addItemAtEnd(String name, int id, int qty, double price) { /* implementation */ }
    public void removeItemById(int id) { /* implementation */ }
    public void updateQuantity(int id, int newQty) { /* implementation */ }
    public Node searchById(int id) { /* implementation */ return null; }
    public Node searchByName(String name) { /* implementation */ return null; }
    public double calculateTotalValue() { /* implementation */ return 0; }
    public void sortByName() { /* implementation */ }
    public void sortByPrice() { /* implementation */ }
    public void display() { /* implementation */ }

    public static void main(String[] args) {
        // Demo usage
    }
}
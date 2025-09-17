// Problem 8: Doubly Linked List - Undo/Redo Functionality
public class UndoRedoDoublyLinkedList {
    static class Node {
        String textState;
        Node prev, next;
        Node(String textState) {
            this.textState = textState;
        }
    }
    private Node current;
    public void addState(String newState) { /* implementation */ }
    public void undo() { /* implementation */ }
    public void redo() { /* implementation */ }
    public void displayCurrentState() { /* implementation */ }

    public static void main(String[] args) {
        // Demo usage
    }
}
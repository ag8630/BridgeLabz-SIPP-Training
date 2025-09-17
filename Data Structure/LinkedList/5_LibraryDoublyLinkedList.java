// Problem 5: Doubly Linked List - Library Management System
public class LibraryDoublyLinkedList {
    static class Node {
        String title;
        String author;
        String genre;
        int bookId;
        boolean available;
        Node prev, next;
        Node(String title, String author, String genre, int bookId, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.available = available;
        }
    }
    private Node head, tail;
    public void addBookAtEnd(String title, String author, String genre, int id, boolean available) { /* implementation */ }
    public void removeBookById(int id) { /* implementation */ }
    public void searchByTitle(String title) { /* implementation */ }
    public void searchByAuthor(String author) { /* implementation */ }
    public void updateAvailability(int id, boolean status) { /* implementation */ }
    public void displayForward() { /* implementation */ }
    public void displayBackward() { /* implementation */ }
    public int countBooks() { /* implementation */ return 0; }

    public static void main(String[] args) {
        // Demo usage
    }
}
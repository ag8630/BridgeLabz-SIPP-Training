// Problem 2: Doubly Linked List - Movie Management System
public class MovieManagementDoublyLinkedList {
    static class Node {
        String title;
        String director;
        int year;
        double rating;
        Node prev, next;
        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }
    private Node head, tail;
    public void addAtBeginning(String title, String director, int year, double rating) { /* implementation */ }
    public void addAtEnd(String title, String director, int year, double rating) { /* implementation */ }
    public void addAtPosition(int position, String title, String director, int year, double rating) { /* implementation */ }
    public void removeByTitle(String title) { /* implementation */ }
    public void searchByDirector(String director) { /* implementation */ }
    public void searchByRating(double rating) { /* implementation */ }
    public void updateRating(String title, double newRating) { /* implementation */ }
    public void displayForward() { /* implementation */ }
    public void displayBackward() { /* implementation */ }

    public static void main(String[] args) {
        // Demo usage
    }
}
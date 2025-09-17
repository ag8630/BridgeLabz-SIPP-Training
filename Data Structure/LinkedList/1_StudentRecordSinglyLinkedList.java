// Problem 1: Singly Linked List - Student Record Management
public class StudentRecordSinglyLinkedList {
    static class Node {
        int rollNumber;
        String name;
        int age;
        String grade;
        Node next;
        Node(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }
    private Node head;
    public void addAtBeginning(int rollNumber, String name, int age, String grade) { /* implementation */ }
    public void addAtEnd(int rollNumber, String name, int age, String grade) { /* implementation */ }
    public void addAtPosition(int position, int rollNumber, String name, int age, String grade) { /* implementation */ }
    public void deleteByRollNumber(int rollNumber) { /* implementation */ }
    public Node searchByRollNumber(int rollNumber) { /* implementation */ return null; }
    public void updateGrade(int rollNumber, String newGrade) { /* implementation */ }
    public void display() { /* implementation */ }

    public static void main(String[] args) {
        // Demo usage
    }
}
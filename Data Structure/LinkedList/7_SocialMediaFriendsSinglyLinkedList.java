// Problem 7: Singly Linked List - Social Media Friend Connections
import java.util.List;
public class SocialMediaFriendsSinglyLinkedList {
    static class Node {
        int userId;
        String name;
        int age;
        List<Integer> friends;
        Node next;
        Node(int userId, String name, int age, List<Integer> friends) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friends = friends;
        }
    }
    private Node head;
    public void addFriendConnection(int userId1, int userId2) { /* implementation */ }
    public void removeFriendConnection(int userId1, int userId2) { /* implementation */ }
    public void findMutualFriends(int userId1, int userId2) { /* implementation */ }
    public void displayFriends(int userId) { /* implementation */ }
    public void searchUser(String name) { /* implementation */ }
    public int countFriends(int userId) { /* implementation */ return 0; }

    public static void main(String[] args) {
        // Demo usage
    }
}
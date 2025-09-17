// Problem 3: Circular Linked List - Task Scheduler
public class TaskSchedulerCircularLinkedList {
    static class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;
        Node(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }
    private Node head;
    public void addTaskAtEnd(int id, String name, int priority, String dueDate) { /* implementation */ }
    public void removeTaskById(int id) { /* implementation */ }
    public void viewCurrentTask() { /* implementation */ }
    public void moveToNextTask() { /* implementation */ }
    public void displayTasks() { /* implementation */ }
    public void searchByPriority(int priority) { /* implementation */ }

    public static void main(String[] args) {
        // Demo usage
    }
}
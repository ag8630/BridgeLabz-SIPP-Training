
// Bubble Sort - Sort Student Marks
public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {85, 70, 92, 60, 75};
        bubbleSort(marks);
        System.out.print("Sorted Marks: ");
        for (int m : marks) System.out.print(m + " ");
    }
}

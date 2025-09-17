
// Selection Sort - Sort Exam Scores
public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) minIndex = j;
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {56, 89, 45, 70, 90};
        selectionSort(scores);
        System.out.print("Sorted Exam Scores: ");
        for (int s : scores) System.out.print(s + " ");
    }
}

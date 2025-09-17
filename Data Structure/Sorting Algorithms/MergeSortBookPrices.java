
// Merge Sort - Sort an Array of Book Prices
public class MergeSortBookPrices {
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] prices = {450, 300, 600, 200, 500};
        mergeSort(prices, 0, prices.length - 1);
        System.out.print("Sorted Book Prices: ");
        for (int p : prices) System.out.print(p + " ");
    }
}

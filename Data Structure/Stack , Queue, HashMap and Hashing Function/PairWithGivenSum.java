import java.util.*;

public class PairWithGivenSum {
    public static boolean findPair(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) {
                System.out.println("Pair found: " + num + ", " + (target - num));
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        findPair(arr, 10);
    }
}
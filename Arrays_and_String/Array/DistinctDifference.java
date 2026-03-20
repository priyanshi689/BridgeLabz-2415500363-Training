
import java.util.Arrays;
import java.util.HashSet;

public class DistinctDifference {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        int result[] = new int[n];

        for (int i = 0; i < n; i++) {

            // left side distinct count
            HashSet<Integer> leftSet = new HashSet<>();
            for (int j = 0; j < i; j++) {
                leftSet.add(arr[j]);
            }

            // right side distinct count
            HashSet<Integer> rightSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                rightSet.add(arr[j]);
            }

            result[i] = leftSet.size() - rightSet.size();
        }

        System.out.println(Arrays.toString(result));
    }
}

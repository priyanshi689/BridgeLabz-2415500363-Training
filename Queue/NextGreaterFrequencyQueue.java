import java.util.*;

public class NextGreaterFrequencyQueue {

    public static void main(String[] args) {

        int arr[] = {2, 1, 1, 3, 2, 1};
        int n = arr.length;

        int result[] = new int[n];

        // Step 1: Frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Step 2: Process using Queue
        for (int i = 0; i < n; i++) {

            Queue<Integer> q = new LinkedList<>();

            // add right side elements
            for (int j = i + 1; j < n; j++) {
                q.add(arr[j]);
            }

            result[i] = -1;

            // find next greater frequency
            while (!q.isEmpty()) {
                int val = q.poll();

                if (freq.get(val) > freq.get(arr[i])) {
                    result[i] = val;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
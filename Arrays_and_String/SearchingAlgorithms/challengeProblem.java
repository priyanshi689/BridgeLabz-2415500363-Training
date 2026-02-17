import java.util.*;

class Challenge {

    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] seen = new boolean[n + 1];

        for (int x : arr)
            if (x > 0 && x <= n)
                seen[x] = true;

        for (int i = 1; i <= n; i++)
            if (!seen[i])
                return i;

        return n + 1;
    }

    static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) return m;
            if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}

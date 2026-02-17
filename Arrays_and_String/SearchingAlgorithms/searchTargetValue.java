class MatrixSearch {
    static boolean search(int[][] mat, int target) {
        int r = mat.length;
        int c = mat[0].length;
        int l = 0, h = r * c - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            int row = m / c;
            int col = m % c;

            if (mat[row][col] == target) return true;
            if (mat[row][col] < target) l = m + 1;
            else h = m - 1;
        }
        return false;
    }
}

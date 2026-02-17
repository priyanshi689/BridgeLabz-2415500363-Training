class NQueens {

    static boolean solve(int row, int[] board, boolean[] col, boolean[] d1, boolean[] d2, int n) {
        if (row == n) return true;

        for (int c = 0; c < n; c++) {
            int id1 = row - c + n - 1;
            int id2 = row + c;

            if (!col[c] && !d1[id1] && !d2[id2]) {
                board[row] = c;
                col[c] = d1[id1] = d2[id2] = true;

                if (solve(row + 1, board, col, d1, d2, n))
                    return true;

                col[c] = d1[id1] = d2[id2] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] board = new int[n];
        boolean[] col = new boolean[n];
        boolean[] d1 = new boolean[2 * n - 1];
        boolean[] d2 = new boolean[2 * n - 1];

        solve(0, board, col, d1, d2, n);

        for (int i = 0; i < n; i++)
            System.out.println(i + " -> " + board[i]);
    }
}

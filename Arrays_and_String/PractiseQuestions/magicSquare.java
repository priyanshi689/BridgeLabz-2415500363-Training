class magicSquare {
    static boolean isMagic(int[][] m) {
        int n = m.length;
        int sum = 0;

        for (int j = 0; j < n; j++)
            sum += m[0][j];

        for (int i = 1; i < n; i++) {
            int row = 0;
            for (int j = 0; j < n; j++)
                row += m[i][j];
            if (row != sum) return false;
        }

        for (int j = 0; j < n; j++) {
            int col = 0;
            for (int i = 0; i < n; i++)
                col += m[i][j];
            if (col != sum) return false;
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += m[i][i];
            d2 += m[i][n - i - 1];
        }

        return d1 == sum && d2 == sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        System.out.println(isMagic(mat));
    }
}

class WordSearch {

    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    static boolean search(char[][] grid, String word, int i, int j, int idx, boolean[][] vis) {
        if (idx == word.length()) return true;

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return false;

        if (vis[i][j] || grid[i][j] != word.charAt(idx))
            return false;

        vis[i][j] = true;

        for (int d = 0; d < 8; d++) {
            if (search(grid, word, i + dx[d], j + dy[d], idx + 1, vis))
                return true;
        }

        vis[i][j] = false;
        return false;
    }

    static boolean exists(char[][] grid, String word) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (search(grid, word, i, j, 0, vis))
                    return true;

        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'C','A','T','S'},
                {'O','R','E','A'},
                {'D','E','A','M'},
                {'E','L','L','S'}
        };

        System.out.println(exists(grid, "DREAM"));
    }
}

class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int r, int c, int size) {
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size; j++) {
                int temp = grid[r + i][c + j];
                grid[r + i][c + j] = grid[r + size - 1 - i][c + j];
                grid[r + size - 1 - i][c + j] = temp;
            }
        }
        return grid;
    }
}
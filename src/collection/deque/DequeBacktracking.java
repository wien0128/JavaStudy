package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBacktracking {
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private static final int ROWS = 5;
    private static final int COLS = 5;
    private static boolean[][] visited = new boolean[ROWS][COLS];

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };

        Deque<int[]> path = new ArrayDeque<>();
        if (backtracking(maze, 0, 0, path)) {
            System.out.println("Path Found: ");
            for (int [] pos : path) {
                System.out.println("[" + pos[0] + ", " + pos[1] + "]");
            }
        } else {
            System.out.println("No Path Found");
        }
    }

    private static boolean backtracking(int[][] maze, int row, int col, Deque<int[]> path) {
        if (row < 0 || col < 0 || row >= ROWS || col >= COLS || maze[row][col] == 0 || visited[row][col]) {
            return false;
        }

        path.addLast(new int[]{row, col});
        visited[row][col] = true;

        if (row == ROWS - 1 && col == COLS - 1) {
            return true;
        }

        for (int [] d : DIRECTIONS) {
            int newRow = row + d[0];
            int newCol = col + d[1];
            if (backtracking(maze, newRow, newCol, path)) {
                return true;
            }
        }

        path.removeLast();
        visited[row][col] = false;

        return false;
    }
}

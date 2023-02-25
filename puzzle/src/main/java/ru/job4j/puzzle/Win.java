package ru.job4j.puzzle;

public class Win {

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int[] row : board) {
            if (row[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        for (int index = 0; index < board.length; index++) {
            if (monoHorizontal(board, index)) {
                return true;
            }
            if (monoVertical(board, index)) {
                return true;
            }
        }
        return false;
    }
}

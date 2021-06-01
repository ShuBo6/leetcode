package offer;

public class p12 {

    int row, col;

    public boolean exist(char[][] board, String word) {

        row = board.length;
        col = board[0].length;


        if (word.length() > row * col ) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }

            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word, int StrCursor, int x, int y) {

        if (x >= row || y >= col || x < 0 || y < 0 || board[x][y] != word.charAt(StrCursor)) {
            return false;
        }
        if (StrCursor == word.length() - 1) {
            return true;
        }
        char temp = board[x][y];
        board[x][y] = '\0';
        boolean res = (dfs(board, word, StrCursor + 1, x + 1, y) || dfs(board, word, StrCursor + 1, x - 1, y)
                || dfs(board, word, StrCursor + 1, x, y + 1) || dfs(board, word, StrCursor + 1, x, y - 1));

        board[x][y] = temp;
        return res;

    }

    public static void main(String[] args) {
        char[][] borad1={{'a'}};
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        System.out.println(new p12().exist(borad1, "a"));
        // System.out.println(new p12().exist(board, "A"));
        // System.out.println(new p12().exist(board, "AB"));
        // System.out.println(new p12().exist(board, "ABCCED"));
        // System.out.println(new p12().exist(board, "ABS"));
        // System.out.println(new p12().exist(board, "ESE"));
        // System.out.println(new p12().exist(board, "ESE"));
    }
}
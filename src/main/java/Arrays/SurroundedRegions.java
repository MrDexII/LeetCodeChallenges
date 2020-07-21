package Arrays;

public class SurroundedRegions {

    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return;

        final int rows = board.length;
        final int columns = board[0].length;

        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') boundaryDFS(board, i, 0);
            if (board[i][columns - 1] == 'O') boundaryDFS(board, i, columns - 1);
        }
        for (int j = 0; j < columns; j++) {
            if (board[0][j] == 'O') boundaryDFS(board, 0, j);
            if (board[rows - 1][j] == 'O') boundaryDFS(board, rows - 1, j);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }

    }

    private void boundaryDFS(char[][] board, int i, int j) {
        if (i > board.length - 1 || i < 0 || j > board[0].length || j < 0) return;

        if (board[i][j] == 'O') board[i][j] = '*';
        if (i > 0 && board[i - 1][j] == 'O') {//top
            boundaryDFS(board, i - 1, j);
        }
        if (i < board.length - 1 && board[i + 1][j] == 'O') {//bottom
            boundaryDFS(board, i + 1, j);
        }
        if (j > 0 && board[i][j - 1] == 'O') {//left
            boundaryDFS(board, i, j - 1);
        }
        if (j < board[0].length - 1 && board[i][j + 1] == 'O') {//right
            boundaryDFS(board, i, j + 1);
        }
    }

    public static void main(String[] args) {
        SurroundedRegions surroundedRegions = new SurroundedRegions();

        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };

        surroundedRegions.solve(board);
    }
}

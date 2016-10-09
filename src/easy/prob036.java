package easy;

public class prob036 {
    public boolean isValidSudoku(char[][] board) {
        
        boolean[] digit;
        
        for (int i = 0; i < 9; i++) {
            digit = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int c = board[i][j] - '1';
                if (digit[c] == true) {
                    return false;
                }
                else {
                    digit[c] = true;
                }
            }
        }
        
        for (int i = 0; i < 9; i++) {
            digit = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }                
                int c = board[j][i] - '1';
                if (digit[c] == true) {
                    return false;
                }
                else {
                    digit[c] = true;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                digit = new boolean[9];
                for (int k = i * 3; k < (i+1) * 3; k++) {
                    for (int m = j * 3; m < (j+1) * 3; m++) {
                        if (board[k][m] == '.') {
                            continue;
                        }
                        int c = board[k][m] - '1';
                        if (digit[c]) {
                            return false;
                        }
                        else {
                            digit[c] = true;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}

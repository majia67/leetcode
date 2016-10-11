package medium;

public class Prob048_Rotate_Image {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n+1)/2; i++) {
            int k = n-i-1;
            for (int j = i; j < n-i-1; j++) {
                int l = n-j-1;
                int tmp = matrix[l][i];
                matrix[l][i] = matrix[k][l];
                matrix[k][l] = matrix[j][k];
                matrix[j][k] = matrix[i][j];
                matrix[i][j] = tmp;
            }            
        }
    }
}

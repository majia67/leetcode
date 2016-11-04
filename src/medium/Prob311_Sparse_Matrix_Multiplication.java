package medium;

public class Prob311_Sparse_Matrix_Multiplication {
    public int[][] multiply(int[][] A, int[][] B) {
        
        List<Integer> csrIA = new ArrayList<Integer>();
        List<Integer> csrJA = new ArrayList<Integer>();
        transToCSR(A, csrIA, csrJA);
        
        List<Integer> csrIB = new ArrayList<Integer>();
        List<Integer> csrJB = new ArrayList<Integer>();
        transToCSR(B, csrIB, csrJB);
        
        int[][] C = new int[A.length][B[0].length];
        
        int colIndexA = 0;
        for (int rowA = 0; rowA < A.length; rowA++) {
            int colNumA = csrIA.get(rowA);
            for (; colIndexA < colNumA; colIndexA++) {
                int colA = csrJA.get(colIndexA);
                
                int rowB = colA;
                int colNumB = 0;
                int colIndexB = 0;
                if (rowB == 0) {
                    colNumB = csrIB.get(0);
                } else {
                    colNumB = csrIB.get(rowB);
                    colIndexB = csrIB.get(rowB-1);
                }
                for (; colIndexB < colNumB; colIndexB++) {
                    int colB = csrJB.get(colIndexB);
                    C[rowA][colB] += A[rowA][colA] * B[rowB][colB];
//                    System.out.println(rowA + " " + colA + " " + rowB + " " + colB + " " + C[rowA][colB]);
                }
            }
        }
        
        return C;
    }
    
    private void transToCSR(int[][] M, List<Integer> IM, List<Integer> JM) {
        int nnz = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] != 0) {
                    nnz++;
                    JM.add(j);
                }
            }
            IM.add(nnz);
        }
    }
}

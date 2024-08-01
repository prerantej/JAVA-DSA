package java_basics.Arrays.Medium;

class SetZeroesInMatrix {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean col = false;
        boolean row = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                col = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                row = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (col) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        if (row) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        SetZeroesInMatrix obj = new SetZeroesInMatrix();

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        obj.setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

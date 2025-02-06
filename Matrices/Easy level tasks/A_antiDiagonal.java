import java.util.Scanner;

class A_antiDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.close();

        int[][] m = genAntiDiagMatrix(size);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] genAntiDiagMatrix(int size) {
        int[][] matrix = new int[size][size];
        int compareToSize = size - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) == compareToSize) {
                    matrix[i][j] = 1;
                }
                else if ((i + j) > compareToSize) {
                    matrix[i][j] = 2;
                }
            }
        }
        return matrix;
    }
}

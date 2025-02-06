import java.util.Scanner;

class B_confirmSymmetry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] m = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j] = input.nextInt();
            }
        }
        input.close();

        if (confirmSymmetry(m)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

    static Boolean confirmSymmetry(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

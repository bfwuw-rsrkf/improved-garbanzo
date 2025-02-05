import java.util.Scanner;

class D_minMaxMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] m = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = input.nextInt();
            }
        }
        input.close();

        int[] minMax = minMaxMatrix(m);
        for (int i = 0; i < 3; i++) {
            System.out.print(minMax[i] + " ");
        }
        
        System.out.println();
        for (int i = 3; i < 6; i++) {
            System.out.print(minMax[i] + " ");
        }
    }

    static int[] minMaxMatrix(int[][] matrix) {
        int[] minMax = new int[6];

        minMax[0] = 1;
        minMax[1] = 1;
        minMax[2] = matrix[0][0];

        minMax[3] = 1;
        minMax[4] = 1;
        minMax[5] = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currElem = matrix[i][j];

                if (currElem < minMax[2]) {
                    minMax[0] = i + 1;
                    minMax[1] = j + 1;
                    minMax[2] = currElem;
                }

                else if (currElem > minMax[5]) {
                    minMax[3] = i + 1;
                    minMax[4] = j + 1;
                    minMax[5] = currElem;
                } 
            }
        }

        return minMax;
    }
}

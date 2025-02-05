import java.util.Scanner;
import java.util.ArrayList;

class F_columnsContainingMax {
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

        ArrayList<Integer> columnsContainingMax = findColumnsContainingMax(m, rows);
        for (int i = 0; i < columnsContainingMax.size() / rows; i++) {
            int currIndex = i * (rows - 1);
            for (int j = currIndex; j < currIndex + rows; j++) {
                System.out.print(columnsContainingMax.get(j) + " ");
            }
            System.out.println();
        }
    }

    static ArrayList<Integer> findColumnsContainingMax(int[][] matrix, int columnSize) {
        ArrayList<Integer> targetColumnsIndex = new ArrayList<>();
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currElem = matrix[i][j];

                if (max < currElem) {
                    targetColumnsIndex.clear();
                    targetColumnsIndex.add(j);
                    max = currElem;
                }
                
                else if (currElem == max) {
                    targetColumnsIndex.add(j);
                }
            }
        } 

        ArrayList<Integer> targetColumns = new ArrayList<>();
        for (int j = 0; j < targetColumnsIndex.size(); j++) {
            for (int i = 0; i < columnSize; i++) {
                targetColumns.add(matrix[i][targetColumnsIndex.get(j)]);
            }
        }

        return targetColumns;
    }
}

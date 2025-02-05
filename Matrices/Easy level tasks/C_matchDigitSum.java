import java.util.Scanner;

class C_matchDigitSum {
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

        int digits = input.nextInt();
        int multiple = input.nextInt();
        input.close();

        System.out.println(matchDigitSum(m, digits, multiple));
    }

    static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    static int matchDigitSum(int[][] matrix, int digitNum, int beMultiple) {
        int count = 0;
        int lowerBound = (int)Math.pow(10, digitNum - 1);
        int upperBound = (int)Math.pow(10, digitNum);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int nat = matrix[i][j];
                if (lowerBound <= nat && nat < upperBound) {
                    if (sumDigits(nat) % beMultiple == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

import java.util.Scanner;

class B_outputSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] squares = squares(input.nextInt());
        input.close();

        for (int i = 0; i < squares.length; i++) {
            System.out.print(squares[i] + " ");
        }
    }

    static int[] squares(int length) {
        int[] squares = new int[length];
        for (int i = 0; i < length; i++) {
            squares[i] = (i+1)*(i+1);
        }
        return squares;
    }
}

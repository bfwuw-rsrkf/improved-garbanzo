import java.util.Scanner;

class I_fibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] fibonacci = fibonacci(input.nextInt());
        input.close();

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    static int[] fibonacci(int length) {
        int[] fibonacci = new int[length];
        fibonacci[0] = 1;
        if (length > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < length; i++) {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        return fibonacci;
    }
}

import java.util.Scanner;

class A_multiplicationUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(useForToMultiply(input.nextInt(), input.nextInt()));
        input.close();
    }

    static int useForToMultiply(int firstNumber, int secondNumber) {
        int result = 0;
        int addPerIteration = Math.abs(firstNumber);
        int end = Math.abs(secondNumber);

        for (int i = 0; i < end; i++) {
            result += addPerIteration;
        }

        if (firstNumber < 0 && secondNumber > 0 || firstNumber > 0 && secondNumber < 0) {
            return -result;
        }
        return result;
    }
}

import java.util.Scanner;

class W_factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(factorial(input.nextInt()));
        input.close();
    }

    static int factorial(int number) {
        int result = 1;
        int factor = number;
        for (int i = 0; i < number; i++) {
            result *= factor;
            factor--;
        }
        return result;
    }
}

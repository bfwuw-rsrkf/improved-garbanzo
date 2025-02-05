import java.util.Scanner;

class H_factorizeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        factorizeNumber(n);
    }

    static void factorizeNumber(int number) {
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(number);
    }
}

import java.util.Scanner;

class K_sumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numsN = input.nextInt();
        input.close();
        System.out.println(sumNumbers(input, numsN));
    }

    static int sumNumbers(Scanner input, int numberOfNumbers) {
        int sum = 0;
        for (int i = 0; i < numberOfNumbers; i++) {
            sum += input.nextInt();
        }
        return sum;
    }
}

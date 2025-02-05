import java.util.Scanner;

class N_classifyNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numsN = input.nextInt();
        input.close();
        System.out.println(classifyNumbers(input, numsN));
    }

    static String classifyNumbers(Scanner input, int numberOfNumbers) {
        int zeros = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for (int i = 0; i < numberOfNumbers; i++) {
            int inputNumber = input.nextInt();
            if (inputNumber > 0) {
                positiveNumbers++;
            }
            else if (inputNumber < 0) {
                negativeNumbers++;
            }
            else {
                zeros++;
            }
        }

        return String.format("%d %d %d", zeros, positiveNumbers, negativeNumbers);
    }
}

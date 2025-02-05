import java.util.Scanner;

class B_outputEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        outputEvenNumbers(numbers);;
    }

    static void outputEvenNumbers(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                System.out.print(numbersArray[i] + " ");
            }
        }
    }
}

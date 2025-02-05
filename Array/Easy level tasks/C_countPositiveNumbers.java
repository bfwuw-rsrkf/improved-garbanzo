import java.util.Scanner;

class C_countPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        System.out.println(countPositiveNumbers(numbers));
    }

    static int countPositiveNumbers(int[] numbersArray) {
        int count = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > 0) {
                count++;
            }
        }
        return count;
    }
}

import java.util.Scanner;

class G_reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        reverseArray(numbers);
    }

    static void reverseArray(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[numbersArray.length - i - 1] + " ");
        }
    }
}

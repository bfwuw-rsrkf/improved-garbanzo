import java.util.Scanner;

class J_maxArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();

        System.out.println(maxArrayElement(numbers));
    }

    static int maxArrayElement(int[] numbersArray) {
        int maxElement = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            if (Math.max(maxElement, numbersArray[i]) != maxElement) {
                maxElement = Math.max(maxElement, numbersArray[i]);
            }
        }
        return maxElement;
    }
}

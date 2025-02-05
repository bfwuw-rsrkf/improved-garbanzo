import java.util.Scanner;

class K_notDivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sequence = randomSequence(input.nextInt(), input.nextInt(),input.nextInt());
        input.close();

        int count = countNotDivisibleByFive(sequence);
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
        System.out.println("\n" + count);
    }

    static int[] randomSequence(int start, int end, int length) {
        int[] sequence = new int[length];
        for (int i = 0; i < length; i++) {
            sequence[i] = (int)(start + (Math.random() * (end - start)));
        }
        return sequence;
    }

    static int countNotDivisibleByFive(int[] numbersArray) {
        int count = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (1000 > numbersArray[i] && numbersArray[i] > 99 && numbersArray[i] % 5 != 0) {
                count++;
            }
        }
        return count;
    }
}

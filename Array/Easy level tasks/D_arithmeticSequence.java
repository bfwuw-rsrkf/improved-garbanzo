import java.util.Scanner;

class D_arithmeticSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sequence = arithmeticSequence(input.nextInt(), input.nextInt(), input.nextInt());
        input.close();

        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
    }

    static int[] arithmeticSequence(int firstElement, int difference, int length) {
        int[] sequence = new int[length];
        sequence[0] = firstElement;
        for (int i = 1; i < length; i++) {
            sequence[i] = sequence[i-1] + difference;
        }
        return sequence;
    }
}

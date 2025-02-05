import java.util.Scanner;

class O_arithmeticMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int length = input.nextInt();
        input.close();

        int[] sequence = randomSequence(start, end, length);
        int i = 0;
        while (i < sequence.length) {
            System.out.print(sequence[i] + " ");
            i++;
        }

        System.out.println("\n" + arithmeticMean(sequence));
    }

    static int[] randomSequence(int start, int end, int length) {
        int[] sequence = new int[length];
        int range = end - start;
        int i = 0;

        while (i < length) {
            sequence[i] = (int)(start + (Math.random() * range));
            i++;
        }

        return sequence;
    }

    static String arithmeticMean(int[] sequence) {
        int sum = 0;
        int i = 0;

        while (i < sequence.length) {
            sum+=sequence[i];
            i++;
        }
        
        return String.format("%.3f", sum / (double)sequence.length);
    }
}

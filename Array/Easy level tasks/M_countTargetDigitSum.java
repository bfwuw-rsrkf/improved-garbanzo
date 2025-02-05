import java.util.Scanner;

class M_countTargetDigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int length = input.nextInt();
        int digitSum = input.nextInt();
        input.close();

        int[] sequence = randomSequence(start, end, length);
        int i = 0;
        while (i < sequence.length) {
            System.out.print(sequence[i] + " ");
            i++;
        }

        System.out.print("\n" + countTargetDigitSum(sequence, digitSum));
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

    static int sumDigits(int number) {
        int sum = 0;
        int numberCopy = number;
        int i = 1;
        int j = 0;

        while (numberCopy != 0) {
            int remainder = (int)(numberCopy % Math.pow(10, i++));
            numberCopy-=remainder;
            sum+=(remainder / Math.pow(10, j++));
        }

        return Math.abs(sum);
    }

    static int countTargetDigitSum(int[] sequence, int target) {
        int count = 0;
        int i = 0;

        while (i < sequence.length) {
            if (sumDigits(sequence[i]) == target) {
                count++;
            }
            i++;
        }

        return count;
    }
}

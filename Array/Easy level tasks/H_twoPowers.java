import java.util.Scanner;

class H_twoPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] powers = powers(input.nextInt());
        input.close();

        for (int i = 0; i < powers.length; i++) {
            System.out.print(powers[i] + " ");
        }
    }

    static int[] powers(int length) {
        int[] powers = new int[length];
        for (int i = 0; i < length; i++) {
            powers[i] = (int)Math.pow(2, length - i);
        }
        return powers;
    }
}

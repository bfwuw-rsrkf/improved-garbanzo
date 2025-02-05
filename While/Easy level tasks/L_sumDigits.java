import java.util.Scanner;

class L_sumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        input.close();
        System.out.println(sumDigits(n));
    }

    static int sumDigits(String naturalNumber) {
        int sum = 0;
        int iterations = 0;
        Scanner extractNumbers = new Scanner(naturalNumber.replace("", " "));

        while (iterations < naturalNumber.length()) {
            sum += extractNumbers.nextInt();
            iterations++;
        }
        extractNumbers.close();

        return sum;
    }
}

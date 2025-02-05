import java.util.Scanner;

class I_countFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(countFactors(n));
    }

    static int countFactors(int number) {
        if (number > 1) {
            int count = 2;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    if (number / i == i) {
                        count++;
                    }
                    else {
                        count+=2;
                    }
                }
            }
            return count;
        }
        return number;
    }
}

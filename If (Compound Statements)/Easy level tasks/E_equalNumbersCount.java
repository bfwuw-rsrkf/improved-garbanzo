import java.util.Scanner;

class E_equalNumbersCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n0 = input.nextInt();
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        input.close();

        System.out.println(countEqualNumbers(n0, n1, n2));
    }

    static int countEqualNumbers(int a, int b, int c) {
        if (a == b) {
            if (b == c) {
                return 3;
            }
            return 2;
        }
        if (b == c) {
            if (c == a) {
                return 3;
            }
            return 2;
        }
        if (c == a) {
            if (a == b) {
                return 3;
            }
            return 2;
        }
        return 0;
    }
}

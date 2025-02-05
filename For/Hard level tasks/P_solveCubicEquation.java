import java.util.Scanner;

class P_solveCubicEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        input.close();

        matchRoot(a, b, c, d);
    }

    static void matchRoot(int a, int b, int c, int d) {
        for (int i = 0; i <= 1000; i++) {
            if (a*i*i*i+b*i*i+c*i+d == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

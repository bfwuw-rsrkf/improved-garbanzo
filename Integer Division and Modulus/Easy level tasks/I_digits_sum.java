import java.util.Scanner;

class I_digits_sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        System.out.println(n / 100 + n % 100 / 10 + n % 10);
    }
}

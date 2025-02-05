import java.util.Scanner;

class Q_days {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        inp.close();
        System.out.println(m / n + (m % n + n - 1) / n);
    }
}

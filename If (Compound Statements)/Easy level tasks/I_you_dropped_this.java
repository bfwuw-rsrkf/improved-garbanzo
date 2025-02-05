import java.util.Scanner;

class I_you_dropped_this {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x0 = inp.nextInt();
        int y0 = inp.nextInt();
        int x1 = inp.nextInt();
        int y1 = inp.nextInt();
        inp.close();

        if (takes_str(x0, y0, x1, y1) || takes_diag(x1 - x0, y1 - y0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static Boolean takes_str(int a0, int b0, int a1, int b1) {
        if (a0 == a1 || b0 == b1) {
            return true;
        }
        return false;
    }

    static Boolean takes_diag(int dif_a, int dif_b) {
        if (dif_a == dif_b || dif_a == -dif_b) {
            return true;
        }
        return false;
    }
}

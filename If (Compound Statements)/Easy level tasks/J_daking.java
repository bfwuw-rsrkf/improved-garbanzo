import java.util.Scanner;

class J_daking {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x0 = inp.nextInt();
        int y0 = inp.nextInt();
        int x1 = inp.nextInt();
        int y1 = inp.nextInt();
        inp.close();

        int dif_x = x1 - x0;
        int dif_y = y1 - y0;

        if (takes_str(dif_x, dif_y) || takes_diag(dif_x, dif_y)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static Boolean takes_str(int dif_a, int dif_b) {
        if ((dif_a == 0 || dif_b == 0) && ((dif_a == 1 || dif_a == -1) || (dif_b == 1 || dif_b == -1))) {
            return true;
        }
        return false;
    }

    static Boolean takes_diag(int dif_a, int dif_b) {
        if ((dif_a == dif_b || dif_a == -dif_b) && (dif_a == 1 || dif_a == -1)) {
            return true;
        }
        return false;
    }
}

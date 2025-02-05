import java.util.Scanner;

class K_yorunii {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x0 = inp.nextInt();
        int y0 = inp.nextInt();
        int x1 = inp.nextInt();
        int y1 = inp.nextInt();
        inp.close();

        int dif_x = x1 - x0;
        int dif_y = y1 - y0;

        System.out.println(takes(dif_x, dif_y));
    }

    static String takes(int dif_a, int dif_b) {
        if ((Math.abs(dif_a) == 1 && Math.abs(dif_b) == 2) || (Math.abs(dif_a) == 2 && Math.abs(dif_b) == 1)) {
            return "YES";
        }
        return "NO";
    }
}

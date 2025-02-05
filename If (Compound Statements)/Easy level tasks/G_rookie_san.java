import java.util.Scanner;

class G_rookie_san {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x0 = inp.nextInt();
        int y0 = inp.nextInt();
        int x1 = inp.nextInt();
        int y1 = inp.nextInt();
        inp.close();
        System.out.println(takes(x0, y0, x1, y1));
    }

    static String takes(int a0, int b0, int a1, int b1) {
        if (a0 == a1 || b0 == b1) {
            return "YES";
        }
        return "NO";
    }
}

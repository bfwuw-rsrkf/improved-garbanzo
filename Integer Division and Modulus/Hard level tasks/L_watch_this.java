import java.util.Scanner;
import java.text.DecimalFormat;

class L_watch_this {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int s = inp.nextInt();
        inp.close();

        int h = s / 3600;
        s = s - h * 3600;
        h = h - h / 24 * 24;

        int m = s / 60;
        s = s - m * 60;

        DecimalFormat t = new DecimalFormat("00");
        System.out.printf("%d:%s:%s", h, t.format(m), t.format(s));
    }
}

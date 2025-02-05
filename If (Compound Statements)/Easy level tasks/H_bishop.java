import java.util.Scanner;

class H_bishop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x0 = inp.nextInt();
        int y0 = inp.nextInt();
        int x1 = inp.nextInt();
        int y1 = inp.nextInt();
        inp.close();
        System.out.println(takes(x1 - x0, y1 - y0));
    }
    
    static String takes(int dif_a, int dif_b) {
        if (dif_a == dif_b || dif_a == -dif_b) {
            return "YES";
        }
        return "NO";
    }
}

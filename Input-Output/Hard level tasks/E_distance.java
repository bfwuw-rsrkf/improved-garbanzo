import java.util.Scanner;

class E_distance {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String coords = inp.nextLine() + " " + inp.nextLine();
        inp.close();
        Scanner xy = new Scanner(coords);
        double x1 = xy.nextDouble();
        double y1 = xy.nextDouble();
        double x2 = xy.nextDouble();
        double y2 = xy.nextDouble();
        xy.close();
        System.out.printf("%.3f", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}

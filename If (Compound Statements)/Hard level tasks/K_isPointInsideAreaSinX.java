import java.util.Scanner;

class K_isPointInsideAreaSinX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        System.out.println(isPointInsideTheArea(x, y));
    }

    static String isPointInsideTheArea(double xAxis, double yAxis) {
        if (0 < xAxis && xAxis < Math.PI && 0 < yAxis && yAxis < 0.5 && yAxis < Math.sin(xAxis)) {
            return "YES";
        }
        return "NO";
    }
}
    
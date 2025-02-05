import java.util.Scanner;

class R_isPointInsideAreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        System.out.println(isPointInsideTheArea(x, y));
    }

    static String isPointInsideTheArea(double xAxis, double yAxis) {
        if (-1 < xAxis && xAxis < 1) {
            double yAxisRestriction = Math.sqrt(1 - xAxis*xAxis);
            if (-yAxisRestriction < yAxis && yAxis < yAxisRestriction) {
                return "YES";
            }
            if (0 < xAxis && -yAxisRestriction < yAxis && yAxis < 1) {
                return "YES";
            }
        }
        return "NO";
    }
}

import java.util.Scanner;

class N_isPointInsideAreaSemicircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        System.out.println(isPointInsideTheArea(x, y));
    }

    static String isPointInsideTheArea(double xAxis, double yAxis) {
        if (-1 < xAxis && xAxis < Math.sqrt(0.5)) {
            double yAxisRestriction = Math.sqrt(1 - xAxis*xAxis);
            if (xAxis < 0) {
                if (-yAxisRestriction < yAxis && yAxis < yAxisRestriction) {
                    return "YES";
                }
            }
            if (xAxis < yAxis && yAxis < yAxisRestriction) {
                return "YES";
            }
        }
        return "NO";
    }
}

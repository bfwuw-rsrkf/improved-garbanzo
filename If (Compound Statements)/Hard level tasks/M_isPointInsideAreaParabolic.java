import java.util.Scanner;

class M_isPointInsideAreaParabolic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        System.out.println(isPointInsideTheArea(x, y));
    }
    
    static String isPointInsideTheArea(double xAxis, double yAxis) {
        if (-2 < xAxis && xAxis < 2) {
            if (xAxis*xAxis-2 < yAxis && (yAxis < -xAxis || yAxis < xAxis)) {
                return "YES";
            }
        }
        return "NO";
    }
}

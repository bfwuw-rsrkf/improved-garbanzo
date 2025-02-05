import java.util.Scanner;

class C_power_of_10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("%.3f", Math.pow(inp.nextDouble(), 10));
        inp.close();
    }
}

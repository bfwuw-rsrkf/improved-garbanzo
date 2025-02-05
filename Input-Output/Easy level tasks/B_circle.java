import java.util.Scanner;

class B_circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rad = inp.nextInt();
        inp.close();
        System.out.printf("%.3f", Math.pow(rad, 2)*Math.PI);
        System.out.printf("\n%.3f", 2*rad*Math.PI);
    }
}

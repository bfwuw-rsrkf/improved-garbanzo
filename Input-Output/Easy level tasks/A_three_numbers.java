import java.util.Scanner;

class A_three_numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();
        inp.close();
        int sum = num1 + num2 + num3;
        System.out.printf("%d+%d+%d=%d\n", num1, num2, num3, sum);
        System.out.printf("%d*%d*%d=%d\n", num1, num2, num3, num1*num2*num3);
        System.out.printf("(%d+%d+%d)/3=%.3f", num1, num2, num3, sum / 3.0);
    }
}

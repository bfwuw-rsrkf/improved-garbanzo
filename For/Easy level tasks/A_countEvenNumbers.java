import java.util.Scanner;

class A_countEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int e = input.nextInt();
        input.close();

        System.out.println(countEvenNumbersInRange(s, e));
    }

    static String countEvenNumbersInRange(int start, int end) {
        String numbers = "";
        for (int i = start + start % 2; i <= end; i+=2) {
            numbers = numbers + i + " ";
        }
        return numbers;
    }
}

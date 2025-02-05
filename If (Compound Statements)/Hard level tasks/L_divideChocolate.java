import java.util.Scanner;

class L_divideChocolate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        input.close();

        System.out.println(possibilityOfDivision(n, m, k));
    }

    static String possibilityOfDivision(int width, int height, int targetAmountOfPieces) {
        if (targetAmountOfPieces < width*height && (targetAmountOfPieces % width == 0 || targetAmountOfPieces % height == 0)) {
            return "YES";
        }
        return "NO";
    }
}

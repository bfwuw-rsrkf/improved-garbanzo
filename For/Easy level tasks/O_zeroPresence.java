import java.util.Scanner;

class O_zeroPresence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(zeroPresence(input, input.nextInt()));
        input.close();
    }

    static String zeroPresence(Scanner input, int numberOfNumbers) {
        for (int i = 0; i < numberOfNumbers; i++) {
            if (input.nextInt() == 0) {
                return "YES";
            }
        }
        return "NO";
    }
}

import java.util.Scanner;

class F_determineSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        input.close();

        System.out.println(determineSeason(month));
    }

    static String determineSeason(int monthNumber) {
        if (0 < monthNumber && monthNumber < 13) {
            if ((0 < monthNumber && monthNumber < 3) || monthNumber == 12) {
                return "winter";
            }
            if (2 < monthNumber && monthNumber < 6) {
                return "spring";
            }
            if (5 < monthNumber && monthNumber < 9) {
                return "summer";
            }
            if (8 < monthNumber && monthNumber < 12) {
                return "autumn";
            }
        }
        return "NO";
    }
}

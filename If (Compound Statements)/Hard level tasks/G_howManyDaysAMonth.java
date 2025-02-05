import java.util.Scanner;

class G_howManyDaysAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        input.close();

        System.out.println(daysAMonth(m));
    }

    static int daysAMonth(int monthNumber) {
        if (monthNumber > 12 || 1 > monthNumber) {
            return 0;
        }
        if (monthNumber < 8) {
            if (monthNumber == 2) {
                return 28;
            }
            return 30 + monthNumber % 2;
        }
        return 31 - monthNumber % 2;
    }
}

import java.util.Scanner;

class H_daysTillANewYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int d = input.nextInt();
        input.close();

        System.out.println(daysLeft(m, d));
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

    static int daysLeft(int monthNumber, int dayNumber) {
        if (dayNumber > daysAMonth(monthNumber) || 1 > dayNumber) {
            return -1;
        }
        if (monthNumber > 2) {
            int answer;
            if (monthNumber < 8) {
                answer = 367;
            }
            else {
                answer = 153;
                monthNumber = monthNumber - 7;
            }
            if (monthNumber % 2 == 0)  {
                answer = answer - monthNumber / 2 * 31 - (monthNumber - 1) / 2 * 30 - dayNumber;
            }
            else {
                answer = answer - monthNumber / 2 * 31 - monthNumber / 2 * 30 - dayNumber;
            }
            return answer;
        }
        if (monthNumber == 2) {
            return 334 - dayNumber;
        }
        return 365 - dayNumber;
    }
}

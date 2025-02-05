import java.util.Scanner;

class B_leapybbboy {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int y = inp.nextInt();
        inp.close();
        System.out.println(leap(y));
    }

    static String leap(int year) {
        if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
            return "YES";
        }
        return "NO";
    }
}

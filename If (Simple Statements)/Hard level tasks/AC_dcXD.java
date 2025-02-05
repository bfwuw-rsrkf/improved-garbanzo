import java.util.Scanner;

class AC_dcXD {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();
        int z = inp.nextInt();
        inp.close();
        System.out.println(check(x, y, z));
    }

    static String check(int a, int b, int c) {
        if (( a + b ) % 2 != 0) {
            return "YES";
        }
        else if ((a + c) % 2 != 0) {
            return "YES";
        }
        return "NO";
    }
}

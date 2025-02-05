import java.util.Scanner;

class B_matchRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int e = input.nextInt();
        int r = input.nextInt();
        int d = input.nextInt();
        input.close();

        matchRemainderString(s, e, r, d);
    }

    static void matchRemainderString(int start, int end, int remainder, int divider) {
        for (int i = start; i <= end; i++) {
            if (i % divider == remainder) {
                for (int j = i; j <= end; j+=divider) {
                    System.out.print(j + " ");
                }
                break;
            }
        }
    }
}

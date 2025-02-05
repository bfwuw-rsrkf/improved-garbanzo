import java.util.Scanner;

class D_givusasign {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(sign(inp.nextInt()));
        inp.close();
    }

    static int sign(int x) {
        if (x > 0) {
            return 1;
        }
        else if (x < 0) {
            return -1;
        }
        return 0;
    }
}

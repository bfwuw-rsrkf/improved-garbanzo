import java.util.Scanner;

class A_biggest_n {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(max(inp.nextInt(), inp.nextInt()));
        inp.close();
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}

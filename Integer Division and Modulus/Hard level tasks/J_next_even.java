import java.util.Scanner;

class J_next_even {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(n + 2 - n % 2);
        inp.close();
    }
}

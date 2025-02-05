import java.util.Scanner;

class D_apples_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        inp.close();
        System.out.println(k % n);
    }
}

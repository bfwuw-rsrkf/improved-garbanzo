import java.util.Scanner;

class B_minmax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n0 = inp.nextInt();
        int n1 = inp.nextInt();
        int n2 = inp.nextInt();
        int n3 = inp.nextInt();
        int n4 = inp.nextInt();
        inp.close();

        System.out.println(min5(n0, n1, n2, n3, n4));
        System.out.println(max5(n0, n1, n2, n3, n4));
    }

    static int min5(int n0, int n1, int n2, int n3, int n4) {
        int min = n0;

        if (min > n1) {
            min = n1;
        }
        if (min > n2) {
            min = n2;
        }
        if (min > n3) {
            min = n3;
        }
        if (min > n4) {
            min = n4;
        }

        return min;
    }
    
    static int max5(int n0, int n1, int n2, int n3, int n4) {
        int max = n0;

        if (max < n1) {
            max = n1;
        }
        if (max < n2) {
            max = n2;
        }
        if (max < n3) {
            max = n3;
        }
        if (max < n4) {
            max = n4;
        }

        return max;
    }
}

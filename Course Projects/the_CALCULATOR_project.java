import java.util.Scanner;

class the_CALCULATOR_project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please, write your numbers:");
        int x = inp.nextInt();
        int y = inp.nextInt();

        menu();
        int ch = inp.nextInt();
        inp.close();
        clear();

        res(ch, x, y);
    }

    static void menu() {
        System.out.println("1- Multiplication\n2- Division\n3- Subtraction\n4- Addition");
    }

    static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    static void res(int s, int a, int b) {
        System.out.println("Your answer is:");
        if (s == 1) {
            System.out.printf("%d * %d = %d", a, b, mult(a, b));
        }
        else if (s == 2) {
            System.out.printf("%d / %d = %.3f", a, b, div(a, b));
        }
        else if (s == 3) {
            System.out.printf("%d - %d = %d", a, b, sub(a, b));
        }
        else if (s == 4) {
            System.out.printf("%d + %d = %d", a, b, add(a, b));
        }
        else {
            System.out.println("No :3");
        }
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static double div(int a, int b) {
        return a / (double) b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int add(int a, int b) {
        return a + b;
    }
}

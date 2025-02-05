import java.util.Scanner;

class logic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = inp.nextInt();
        inp.close();

        System.out.println(!(i > 0)); // ! = not
        System.out.println(i > 0 && i > 100); // && = and
        System.out.println(i > 0 || i < 0); // || = OR
    }
}

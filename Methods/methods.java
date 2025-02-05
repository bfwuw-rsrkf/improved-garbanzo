import java.util.Scanner;

class methods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("What's your name?");
        hello(inp.nextLine());
        inp.close();
    }

    static void hello(String name) {
        System.out.printf("Hello, %s!", name);
    }
}

import java.util.Scanner;

class input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = inp.nextLine();

        System.out.println("How old are you?");
        int age = inp.nextInt();

        inp.nextLine(); // clearing the scanner :D

        System.out.println("What is your favourite food?");
        String food = inp.nextLine();

        inp.close(); // closing the scanner >:(

        System.out.printf("Hello, %s!\nJust as you said, you are %d years old!\nAnd your favourite food is %s.", name, age, food);
    }
}

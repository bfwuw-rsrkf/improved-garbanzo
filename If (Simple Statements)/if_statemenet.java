import java.util.Scanner;

class if_statemenet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("How old are you?");
        int old_enough = inp.nextInt();
        inp.close();
        if (is_adult(old_enough)) {
            System.out.println("You can vote now!");
        }
        else {
            System.out.println("You can't vote :(");
        }
    }

    static boolean is_adult(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}

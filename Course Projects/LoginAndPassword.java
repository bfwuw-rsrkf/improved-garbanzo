import java.util.Scanner;

class LoginAndPassword {
    public static void main(String[] args) {
        clear();
        int login = 20092006;
        int password = 13072006;

        Scanner input = new Scanner(System.in);
        tryLoginAndPassword(input, login, password);
        System.out.println("Login and password were entered correctly,\nyou have successfully entered the website.");

        input.close();
    }

    static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    static void tryLoginAndPassword(Scanner input, int rightLogin, int rightPassword) {
        int attemptLogin = 0;
        int attemptPassword = 0;
        int incorrectAttempt = 0;
        boolean incorrect = true;

        while (incorrect) {
            System.out.printf("Please, enter the login: ");
            attemptLogin = input.nextInt();
            clear();

            System.out.printf("Please, enter the password: ");
            attemptPassword = input.nextInt();
            clear();

            incorrect = !(attemptLogin == rightLogin && attemptPassword == rightPassword);
            if (!incorrect) {
                break;
            }

            else {
                incorrectAttempt++;

                if (incorrectAttempt == 3) {
                    System.out.println("Please, try again in 5 seconds.\n");
                    long fiveSecondsDelay = System.currentTimeMillis() + 5000;
                    while (System.currentTimeMillis() < fiveSecondsDelay) {}
                    incorrectAttempt = 0;
                }

                else {
                    System.out.println("Login or password were entered incorrectly, please, try again.\n");
                }
            }
        }
    }
}

import java.util.Scanner;

class N_sameDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        input.close();
        System.out.println(sameDigits(n));
    }

    static String sameDigits(String naturalNumber) {
        Scanner extractNumbers = new Scanner(naturalNumber.replace("", " "));
        int firstDigit = extractNumbers.nextInt();
        int iterations = 0;

        while (iterations < naturalNumber.length()-1) {
            if (extractNumbers.nextInt() != firstDigit) {  
                extractNumbers.close();
                return "NO";
            }
            iterations++;
        }
        extractNumbers.close();

        return "YES";
    }
}

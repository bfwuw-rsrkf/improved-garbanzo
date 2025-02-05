import java.util.Scanner;

class K_countEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        input.close();
        System.out.println(countEvenNumbers(n));
    }

    static int countEvenNumbers(String naturalNumber) {
        int count = 0;
        int iterations = 0;
        Scanner extractNumbers = new Scanner(naturalNumber.replace("", " "));

        while (iterations < naturalNumber.length()) {
            if (extractNumbers.nextInt() % 2 == 0) {
                count++;
            }
            iterations++;
        }
        extractNumbers.close(); 

        return count;
    }
}

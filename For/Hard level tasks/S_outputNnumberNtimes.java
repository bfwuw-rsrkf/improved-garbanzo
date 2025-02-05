import java.util.Scanner;

class S_outputNnumberNtimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        input.close();
        outputNnumberNtimes(s);        
    }

    static void outputNnumberNtimes(int timeInSeconds) {
        int iterations = 0;
        for (int i = 1; i <= timeInSeconds; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                iterations++;
                if (iterations == timeInSeconds) {
                    i = timeInSeconds + 1;
                    break;
                }
            }
        }
    }
}

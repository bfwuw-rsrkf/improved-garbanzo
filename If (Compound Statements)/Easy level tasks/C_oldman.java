import java.util.Scanner;

class C_oldman {
    public static void main(String[] args)  {
        Scanner inp = new Scanner(System.in);
        int ageAnton = inp.nextInt();
        int ageBoris = inp.nextInt();
        int ageVictor = inp.nextInt();
        inp.close();

        System.out.println(answerCode(maxOfThreeVariables(ageAnton, ageBoris, ageVictor), ageAnton, ageBoris, ageVictor));
    }

    static int maxOfThreeVariables(int a, int b, int c) {
        int max = a;
        max = Math.max(max, b);
        max = Math.max(max, c);
        return max;
    }

    static String answerCode(int maxValue, int a, int b, int c) {
        String answer = "";
        int count = 0;
        if (a == maxValue) {
            answer = "A";
            count++;
        }
        if (b == maxValue) {
            answer = answer + " B";
            count++;
        }
        if (c == maxValue) {
            answer = answer + " C";
            count++;
        }
        if (count == 3) {
            return "0";
        }
        return answer.trim();
    }
}

import java.util.Scanner;

class demoMidTerm1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetNumber = input.nextInt();
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        input.close();

        System.out.println(findClosest(targetNumber, firstNumber, secondNumber, thirdNumber));
    }

    static int findClosest(int target, int first, int second, int third) {
        int difference = Math.abs(target - first);
        int closest = first;

        int nextDifference = Math.abs(target - second);
        if (nextDifference < difference) {
            difference = nextDifference;
            closest = second;
        }

        nextDifference = Math.abs(target - third);
        if (nextDifference < difference) {
            closest = third;
        }
        
        return closest;
    }
}

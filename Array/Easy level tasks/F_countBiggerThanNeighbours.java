import java.util.Scanner;

class F_countBiggerThanNeighbours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();
        
        System.out.println(countBiggerThanNeighbours(numbers));
    }

    static int countBiggerThanNeighbours(int[] numbersArray) {
        int count = 0;
        for (int i = 1; i < numbersArray.length - 1; i++) {
            if (numbersArray[i-1] < numbersArray[i] && numbersArray[i] > numbersArray[i+1]) {
                count++;
            }
        }
        return count;
    }
}

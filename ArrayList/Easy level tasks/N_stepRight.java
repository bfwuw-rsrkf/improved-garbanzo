import java.util.Scanner;
import java.util.ArrayList;

class N_stepRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            intList.add(input.nextInt());
        }
        int step = input.nextInt();
        input.close();

        ArrayList<Integer> stepList = stepRightList(intList, step);
        for (int i = 0; i < size; i++) {
            System.out.print(stepList.get(i) + " ");
        }
    }

    static ArrayList<Integer> stepRightList(ArrayList<Integer> integerList, int step) {
        int size = integerList.size();
        ArrayList<Integer> stepRightedList = new ArrayList<>(integerList);

        for (int i = 0; i < size; i++) {
            int stepIndex = i + step;
            if (stepIndex >= size) {
                stepIndex = stepIndex - size;
            }
            stepRightedList.set(stepIndex, integerList.get(i));
        }

        return stepRightedList;
    }
}

import java.util.Scanner;
import java.util.ArrayList;

class S_chooseNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            intList.add(input.nextInt());
        }
        input.close();

        ArrayList<Integer> negList = chooseNegativeList(intList);
        if (negList.isEmpty()) {
            System.out.println(0);
        }
        else {
            for (int i = 0; i < negList.size(); i++) {
                System.out.print(negList.get(i) + " ");
            }
        }
    }

    static ArrayList<Integer> chooseNegativeList(ArrayList<Integer> integerList) {
        ArrayList<Integer> negativeList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            int currentElement = integerList.get(i);
            if (currentElement < 0) {
                negativeList.add(currentElement);
            }
        }
        return negativeList;
    }
}

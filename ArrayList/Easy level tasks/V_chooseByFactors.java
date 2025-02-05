import java.util.Scanner;
import java.util.ArrayList;

class V_chooseByFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            intList.add(input.nextInt());
        }
        int fact = input.nextInt();
        int notFact = input.nextInt();
        input.close();

        ArrayList<Integer> factList = chooseByFactorsList(intList, fact, notFact);
        if (factList.isEmpty()) {
            System.out.println(0);
        }
        else {
            for (int i = 0; i < factList.size(); i++) {
                System.out.print(factList.get(i) + " ");
            }
        }
    }

    static ArrayList<Integer> chooseByFactorsList(ArrayList<Integer> integerList, int factor, int notFactor) {
        ArrayList<Integer> chosenList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            int currentElement = integerList.get(i);
            if (currentElement % factor == 0 && currentElement % notFactor != 0 && 1000 > currentElement && currentElement > 99) {
                chosenList.add(currentElement);
            }
        }
        return chosenList;
    }
}

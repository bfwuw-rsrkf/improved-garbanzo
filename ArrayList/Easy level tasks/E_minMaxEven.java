import java.util.Scanner;
import java.util.ArrayList;

class E_minMaxEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            intList.add(input.nextInt());
        }
        input.close();

        int min = minEvenInteger(intList);
        if (min != -1) {
            System.out.println(min + " " + maxEvenInteger(intList));
        }
        else {
            System.out.println(-1 + " " + -1);
        }
    }

    static int minEvenInteger(ArrayList<Integer> integerList) {
        int minInteger = -1;
        for (int i = 0; i < integerList.size(); i++) {
            int currentElement = integerList.get(i);

            if (currentElement % 2 == 0 && currentElement > 0) {
                minInteger = currentElement;

                for (int j = i; j < integerList.size(); j++) {
                    currentElement = integerList.get(j);
                    if (currentElement < minInteger && currentElement % 2 == 0 && currentElement > 0) {
                        minInteger = currentElement;
                    }
                }
                break;
            }
        }
        return minInteger;
    }

    static int maxEvenInteger(ArrayList<Integer> integerList) {
        int maxInteger = -1;
        for (int i = 0; i < integerList.size(); i++) {
            int currentElement = integerList.get(i);

            if (currentElement % 2 == 0 && currentElement > 0) {
                maxInteger = currentElement;

                for (int j = i; j < integerList.size(); j++) {
                    currentElement = integerList.get(j);
                    if (currentElement > maxInteger && currentElement % 2 == 0 && currentElement > 0) {
                        maxInteger = currentElement;
                    }
                }
                break;
            }
        }
        return maxInteger;
    }
}

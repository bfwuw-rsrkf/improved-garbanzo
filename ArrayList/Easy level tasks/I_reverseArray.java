import java.util.Scanner;
import java.util.ArrayList;

class I_reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            intList.add(input.nextInt());
        }
        input.close();

        ArrayList<Integer> revList = reverseArrayList(intList);
        for (int i = 0; i < size; i++) {
            System.out.print(revList.get(i) + " ");
        }
    }

    static ArrayList<Integer> reverseArrayList(ArrayList<Integer> integerList) {
        ArrayList<Integer> reversedArrayList = new ArrayList<>();
        for (int i = integerList.size() - 1; i > -1; i--) {
            reversedArrayList.add(integerList.get(i));
        }
        return reversedArrayList;
    }
}

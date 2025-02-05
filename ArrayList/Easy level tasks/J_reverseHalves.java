import java.util.Scanner;
import java.util.ArrayList;

class J_reverseHalves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            intList.add(input.nextInt());
        }
        input.close();

        ArrayList<Integer> revList = reverseHalvesList(intList);
        for (int i = 0; i < size; i++) {
            System.out.print(revList.get(i) + " ");
        }
    }

    static ArrayList<Integer> reverseHalvesList(ArrayList<Integer> integerList) {
        int halfSize = integerList.size() / 2 - 1;
        ArrayList<Integer> reversedArrayList = new ArrayList<>();

        for (int i = halfSize; i > -1; i--) {
            reversedArrayList.add(integerList.get(i));
        }
        for (int j = integerList.size() - 1; j > halfSize; j--) {
            reversedArrayList.add(integerList.get(j));
        }

        return reversedArrayList;
    }
}

import java.util.Scanner;
import java.util.ArrayList;

class G_swapPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            intList.add(input.nextInt());
        }
        input.close();

        ArrayList<Integer> swapList = swapIntegerList(intList);
        for (int i = 0; i < size; i++) {
            System.out.print(swapList.get(i) + " ");
        }
    } 

    static ArrayList<Integer> swapIntegerList(ArrayList<Integer> integerList) {
        int size = integerList.size();
        ArrayList<Integer> swappedIntegerList = new ArrayList<>(integerList);

        for (int i = 0; i < size - size % 2; i+=2) {
            int currentElement = swappedIntegerList.get(i);
            swappedIntegerList.set(i, swappedIntegerList.get(i+1));
            swappedIntegerList.set(i+1, currentElement);
        }

        return swappedIntegerList;
    }
}

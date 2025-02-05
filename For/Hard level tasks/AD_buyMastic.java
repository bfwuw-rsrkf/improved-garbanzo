import java.util.Scanner;

class AD_buyMastic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int n = input.nextInt();
        input.close();

        outputPurchaseWays(a, b, c, n);
    }

    static void outputPurchaseWays(int weightA, int weightB, int weightC, int targetWeight) {
        String purchaseWays = "";
        int countWays = 0;

        for (int i = 0; i <= targetWeight / weightA; i++) {
            for (int j = 0; j <= targetWeight / weightB; j++) {
                int currentWeight = targetWeight - i * weightA - j * weightB;
                if (!(currentWeight < 0) && currentWeight % weightC == 0) {
                    purchaseWays = purchaseWays + String.format("%d %d %d\n", i, j, currentWeight / weightC);
                    countWays++;
                }
            }
        }

        System.out.println(countWays);
        System.out.println(purchaseWays);
    }
}

import java.util.Scanner;

class AD_romanXOXO {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.close();
        System.out.println(rom_tens(t) + rom_ones(t % 10));
    }

    static String rom_ones(int i) {
        String ans = "";
        if (i < 9) {
            if (i == 4) {
                ans = "IV";
            }
            else {
                ans = "V".repeat(i / 5) + "I".repeat(i % 5);
            }
        }
        else {
            ans = "IX";
        }
        return ans;
    }

    static String rom_tens(int i) {
        String ans = "";
        if (i < 40) {
            ans = "X".repeat(i / 10);
        }
        else if (i < 50) {
            ans = "XL";
        }
        else if (i < 90) {
            ans = "L" + "X".repeat((i - 50) / 10);
        }
        else {
            if (i != 100) {
                ans = "XC";
            }
            else {
                ans = "C";
            }
        }
        return ans;
    }
}

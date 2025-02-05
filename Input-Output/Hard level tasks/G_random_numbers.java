import java.util.Scanner;
import java.util.Random;

class G_random_numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int start = inp.nextInt();
        int finish = inp.nextInt();
        inp.close();
        Random rand = new Random();
        System.out.printf("%d %d %d %d %d", rand.nextInt(finish - start + 1) + start, rand.nextInt(finish - start + 1) + start, rand.nextInt(finish - start + 1) + start, rand.nextInt(finish - start + 1) + start, rand.nextInt(finish - start + 1) + start);
    }
}

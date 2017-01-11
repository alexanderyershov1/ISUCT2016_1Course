package E;

/**
 * Created by Maxim on 09-Jan-17.
 */
public class Multiply_1 {
    public static void process(int x1, int x2) {
        for (int i = 1; i <= x1; i++) {
            for (int k = 1; k <= x2; k++) {
                System.out.print(k * i + " ");
            }
            System.out.println("");
        }
    }
}

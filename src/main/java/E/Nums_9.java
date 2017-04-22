package E;

/**
 * Created by Maxim on 11-Jan-17.
 */
public class Nums_9 {
    public static void process(int x1) {
        for (int i = 1; i <= x1; i++) {
            System.out.print(i + " ");

            }
        for (int k = x1-2; k >= 0; k=k-2) {
            if (k==0){
                System.out.print("1");
                break;
            }
            System.out.print(k + " ");
        }
    }
}



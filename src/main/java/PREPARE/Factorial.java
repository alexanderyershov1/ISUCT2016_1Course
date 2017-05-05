package PREPARE;

/**
 * Created by maxim-mac on 04/05/2017.
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial DOIT = new Factorial();
        int Result1 = DOIT.loop(5);
        System.out.println(Result1);
        int Result2 = DOIT.iter(5);
        System.out.println(Result2);
    }

    public static int loop(int n) {
        if (n == 0) return 1;
        return n * loop(n - 1);
    }

    public static int iter(int n) {
        int it = 1;
        for (int i = 1; i <= n; i++) {
            it = it * i;
        }
        return it;
    }
}


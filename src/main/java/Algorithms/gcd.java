package Algorithms;

/**
 * Created by maxim-mac on 20/04/2017.
 */
public class gcd {
    public static void main (String []args){
        gcd.gcd_alg(15514,8);
    }

    public static int gcd_alg (int p, int q){
        if (q==0) return p;
        int r = p % q;
        System.out.println(q + " " + r);
        return gcd_alg(q,r);

    }
}

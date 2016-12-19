import java.util.ArrayList;

/**
 * Created by stud_6 on 12.12.16.
 */
public class Calculator {
    public Double equation1(double x) {

        double d1 = Math.pow(x, 2);
        double d2 = d1 - 2.5;
        double d3 = Math.abs(d2);
        double d4 = Math.pow(d3, 1 / 4);


        double d5 = Math.log(d1);
        double d6 = Math.pow(d5, 1 / 3);

        double d7 = d4 + d6;

        System.out.println(d7);

        return d7;

    }


    /// - не нужно, если бы были a / b - понадобились бы
    public ArrayList<Double> equation1(ArrayList<Double> xarr) {
        ArrayList<Double> yres = new ArrayList<Double>();
        for (Double elements : xarr) {
            double y = equation1(elements);

        }
    }
}


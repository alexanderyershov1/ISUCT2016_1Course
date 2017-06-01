import java.util.ArrayList;

public class Calculator {
    public Double calc(double x) {

        double d1 = Math.asin(x);
        double d2 = Math.pow(d1, 3.0);
        double d3 = Math.acos(x);
        double d4 = Math.pow(d3, 3.0);
        double d5 = d2+d4;
        double d6 = Math.exp(x);
        double d7 = d5*d6;
        return d7;
    }

    public ArrayList<Double> calc(double xn, double xk, double dx){
        ArrayList<Double> yRes = new ArrayList<Double>();
        for(double x = xn; x<= xk; x+=dx){
            double y = calc(x);
            yRes.add(y);
        }
        return yRes;
    }
}
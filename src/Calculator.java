/**
 * Created by jakeones on 22.05.2017.
 */

import java.util.ArrayList;

public class Calculator {

    public double calc(double x) {
        double a = Math.pow((Math.pow(Math.asin(x),2) + Math.pow(Math.acos(x),4)),3);
        return a;
    }

    public ArrayList<Double> calc(ArrayList<Double> xVal) {
        ArrayList<Double> yRes = new ArrayList<Double>();
        for (Double calcelements : xVal) {
            Double y = calc(calcelements);
            yRes.add(y);
        }
        return yRes;
    }

    public ArrayList<Double> calc(double xn, double xk, double xd){
        ArrayList<Double> yRes = new ArrayList<Double>();
        for(double x = xn; x<= xk; x+=xd){
            double y = calc(x);
            yRes.add(y);
        }
        return yRes;
    }
}

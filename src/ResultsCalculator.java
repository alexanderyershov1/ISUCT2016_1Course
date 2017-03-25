import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by stud_6 on 19.12.16.
 */
public class ResultsCalculator {
    public static void main(String [] strings){
        Double []tmp ={1.84,2.71,3.81,4.56,5.62};
        ArrayList<Double> xValRes =  new ArrayList<Double>(Arrays.<Double>asList(tmp));
        Calculator calculation = new Calculator();
        xValRes = calculation.equ1(xValRes);
        System.out.println(xValRes);
        xValRes = calculation.equ1(1.25, 3.25, 0.4);
        System.out.println(xValRes);
    }
}

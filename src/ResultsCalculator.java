import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by stud_6 on 19.12.16.
 */
public class ResultsCalculator {
    public static void main(String [] strings){
        Double []tmp ={1.84,2.71,3.81,4.56,5.62};
        ArrayList<Double> xval =  new ArrayList<Double>(Arrays.<Double>asList(tmp));
        Calculator calculation = new Calculator();
        calculation.equation1(xval);
    }
}

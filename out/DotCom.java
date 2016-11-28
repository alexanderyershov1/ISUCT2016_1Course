import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by stud_6 on 14.11.16.
 */
public class DotCom {
    private ArrayList<String> locationCells;

    // private int numOfHits
    public void setLocationCells(ArrayList<String> loc) {

        locationCells = loc;
    }

    public String checkYourself(String userInput) {

        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0)

        {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }//Конец if
        }// Конец  внешнего if
        return result;
    }//Конец метода
}//Конец класса

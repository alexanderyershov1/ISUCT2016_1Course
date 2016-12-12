package FirstGame;

/**
 * Created by stud_6 on 14.11.16.
 */
import java.util.ArrayList;
public class DotCom {
    private ArrayList<String> locationCells;
    // private int numOfHits
    // сейчас нам это не нужно

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;

}
    public String checkYourself(String userInput) {
        String result = "Мимо";
            int index = locationCells.indexOf(userInput);
            if (index >= 0) {
                locationCells.remove(index);

                if (locationCells.isEmpty()) {
                    result = "Потопил";
                } else {
                result = "Попал";
                } //Конец if
            } // Конец внешнего if

        return result;
    } // Конец метода
} // Конец класса


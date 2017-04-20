import java.util.Calendar;
import java.util.Date;


/**
 * Created by maxim-mac on 25/02/2017.
 */
public class HowOld {

    public static void main(String[] args) {

        Calendar birthday = Calendar.getInstance();
        birthday.set(1998, 3, 2, 00, 00, 00);
        long timeMil = birthday.getTimeInMillis();

        long timeMilAtTheMoment = new Date().getTime();
        timeMil = timeMilAtTheMoment - timeMil;

        birthday.setTimeInMillis(timeMil);
        birthday.set(Calendar.YEAR, birthday.get(Calendar.YEAR) - 1970);
        System.out.println(String.format("%tc", birthday));
    }
}


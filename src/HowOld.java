import java.util.Calendar;


/**
 * Created by maxim-mac on 25/02/2017.
 */
public class HowOld {

    public static void main(String[] args) {

        Calendar birthday = Calendar.getInstance();
        birthday.set(1998, 3, 2, 16, 40, 00);

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - birthday.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - birthday.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) - birthday.get(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - birthday.get(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) - birthday.get(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - birthday.get(Calendar.SECOND));

        System.out.println("Мне " + calendar.get(Calendar.YEAR) + " лет, " + calendar.get(Calendar.MONTH) + " месяцев, " + calendar.get(Calendar.DAY_OF_MONTH) + " дней, " + calendar.get(Calendar.HOUR_OF_DAY) + " часов, " + calendar.get(Calendar.MINUTE) + " минут, " + calendar.get(Calendar.SECOND) + " секунд.");

    }
}
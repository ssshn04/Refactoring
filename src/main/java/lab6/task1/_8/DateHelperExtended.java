package lab6.task1._8;

import java.util.Date;

public class DateHelperExtended extends DateHelper {
    public static int daysBetween(Date startDate, Date endDate) {
        long differenceMillis = endDate.getTime() - startDate.getTime();
        return (int) (differenceMillis / (1000 * 60 * 60 * 24));
    }
}

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by ShakirG on 04/03/2018.
 */


public class Solution {
    public static String getDay(String day, String month, String year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));


        int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayofweek) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
        }

        return null;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
        System.out.println("ddd");
    }
}
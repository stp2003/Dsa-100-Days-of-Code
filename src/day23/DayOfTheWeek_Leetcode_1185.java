package day23;

import java.util.Date;

public class DayOfTheWeek_Leetcode_1185 {

    //??
    public static String dayOfTheWeek(int day, int month, int year) {

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Date date = new Date(year - 1900, month - 1, day);

        return days[date.getDay()];
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31, 8, 2019));
    }
}

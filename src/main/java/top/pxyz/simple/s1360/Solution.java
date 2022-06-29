package top.pxyz.simple.s1360;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate d2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int result = (int) (d2.toEpochDay() - d1.toEpochDay());
        if(result >= 0){
            return result;
        }else{
            return result * -1;
        }
    }

    public int daysBetweenDates1(String date1, String date2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dt1 = df.parse(date1);
            Date dt2 = df.parse(date2);
            return Long.compare(dt1.getTime(), dt2.getTime());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

}

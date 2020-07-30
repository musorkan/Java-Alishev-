package Day33_Formatting_TimeStamp;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.FloatControl;
import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Formatting {

    public static void main(String[]args){
    DecimalFormat df = new DecimalFormat("0.00");
    int a = 12;
        System.out.println();

        //====Local Date methods=====
        LocalDate DOB = LocalDate.of(2020,7,24); //year-month-days
        System.out.println(DOB);

        LocalDate today = LocalDate.now(); // if you want to Display the current time
        System.out.println(today);

        LocalTime t1 = LocalTime.of(15,45,55); //hour-minute-second
        System.out.println(t1);

        LocalTime t2 = LocalTime.now().minusMinutes(20); // Minus  minutes from current time
        System.out.println(t2);
        System.out.println("====================================");


        //===============DateTimeFormatter==================

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy, E");
        /*
            year: yy, yyyy
            Month: MM(number), MMM(three letters, MMMM(full Name))
            days:dd
            weekdays name: E, EEEE(entire name)

         */
        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));
        System.out.println("==================================");

        //=============Formatting times=========
        /*

            hours: hh
            minutes: mm
            seconds: ss
            am/pm: a

         */

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));
        System.out.println("========================");


        //========LocalDateTime============

        // May/20/2019  Dayname 4:30 pm

        DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("MMMM/dd/yyyy  EEEE hh:mm  a");

        LocalDateTime da = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(da);
        System.out.println(da.format(dateForm));
        System.out.println("=============================");

        // Saturday 4:34:45 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime NOW = LocalDateTime.now();
        System.out.println(NOW);
        System.out.println(NOW.format(dtf));


}
}
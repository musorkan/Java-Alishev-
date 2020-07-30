package Day33_Formatting_TimeStamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Birthday_Array_dateTime {
    public static void main(String[] args) {

        String[] student = {"Belek", "eric", "Rakhat", "Ernis", "Isa"};
        LocalDate[] birthDays = {
                LocalDate.of(1982,1,26),
                LocalDate.of(1983,12,26),
                LocalDate.of(1984,5,26),
                LocalDate.of(1985,2,26),
                LocalDate.of(1982,6,26),
        };
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy E ");

        for(int i=0;student.length-1>=i;i++){
            String b = student[i] +"'s birthday is ===> "+ birthDays[i].format(dateTimeFormat);
            System.out.println(b);
        }
    }
}

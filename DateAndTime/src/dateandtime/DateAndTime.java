package dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {
        
        DateTimeFormatter form = DateTimeFormatter.ofPattern("HH : MM : SS : dd : mm : YYYY");
        LocalDateTime DT = LocalDateTime.new();
        
        System.out.println("Time and date is -> "+DT);
        
    }
    
}


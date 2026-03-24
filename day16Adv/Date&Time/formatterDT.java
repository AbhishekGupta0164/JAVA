
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatterDT {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // this is the date
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a"); // this is date format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dtf.format(dt); // creating date string using date and formatter
        System.out.println(myDate);
    }
}

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

    //Need to show Subscribers for both of theme
        LocalDate localDate1 = LocalDate.of(2007, 1, 16);


        Date date1 = new Date (2007, 1, 16);

    Streaming streaming1 = new Streaming(localDate1,": Netflix ",235000000,": Netflix Originals,");
        System.out.println(streaming1);
    }
}





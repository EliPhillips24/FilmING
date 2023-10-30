import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class SubscriptionData extends Streaming{
private LocalDate launch;
private String content;

    public SubscriptionData(LocalDate launch,String content) {
        this.launch = launch;
this.content = content;

    }

    public LocalDate getLaunch() {
        return launch;
    }
    public void setLaunch(LocalDate launch) {
        this.launch = launch;
    }

    public LocalDate getContent() {
        return launch;
    }
    public void setContent(String Content) {
        this.content = content;
    }
    public String toString() {
        return getLaunch() +"content is" + getContent();
    }




}

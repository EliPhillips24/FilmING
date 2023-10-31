import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class SubscriptionData extends Streaming{
private LocalDate launch;
private String content;

    public SubscriptionData(String service,String Owner,  LocalDate launch ,  int Subscribers , String content , String Parent) {
        super(service, Subscribers, Owner, Parent);
        this.launch = launch;
        this.content = content;
    }

    public LocalDate getLaunch() {
        return launch;
    }
    public void setLaunch(LocalDate launch) {
        this.launch = launch;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String Content) {
        this.content = content;
    }
    public  String toString() {
        return "The service is " + getService() + "The amount of subscribers are " + getSubscribers()+ "The owner is " + getOwner() + "The location it is in "+ getParent() + " The founding date is " + getLaunch()+ "The content is " + getContent();
    }



    public static void readData() throws Exception {
        File dataFile = new File("src/Streamig");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t|\n");
        while (dataScanner.hasNext()) {

            String service = dataScanner.next();

            String owner = dataScanner.next();

            String launchDate = dataScanner.next();

            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                    .parseCaseInsensitive()
                    .append(DateTimeFormatter.ofPattern("MMMM d, uuuu")) //January 16, 2007
                    .toFormatter(Locale.ENGLISH);

            LocalDate releaseAsLocalDate = LocalDate.parse(launchDate, formatter);

            int subscribers = dataScanner.nextInt();

            String content = dataScanner.next();

            String place = dataScanner.next();

            SubscriptionData newSubscriptionData = new SubscriptionData(service,owner, releaseAsLocalDate , subscribers ,content,place);
            System.out.println(newSubscriptionData);
        }

    }

}

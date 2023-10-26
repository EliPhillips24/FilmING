import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class SubscriptionData extends Streaming{
private LocalDate launch;
private String content;
private String place;

    public SubscriptionData(String launch,  String content, String place) {
        super(launch, content, place);
        this.launch = LocalDate.parse(launch);
        this.content = content;
        this.place = place;
    }
    public SubscriptionData(String service, String owner, LocalDate lauch, double subscribers, String content, String place) {
        super();
    }


    public int getSubscribers() {
        return getSubscribers();
    }

    public void setSubscribers(int subscribers) {
        setSubscribers(subscribers);
    }

    public String getContent() {
        return getContent();
    }

    public void setContent(String content) {
        setContent(content);
    }
    public String getPlace() {
        return getPlace();
    }

    public void setPlace(String Place) {
        Place = Place;
    }
    public String getOwner() {
        return getOwner();
    }

    public void setOwner(String Owner) {
        Owner = Owner;
    }

    public static void readData() throws Exception {
        File dataFile = new File("src/Streamig");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t|\n");
        while (dataScanner.hasNext()) {

            String service = dataScanner.next();

            String owner = dataScanner.next();

            String lauch = dataScanner.next();
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                    .parseCaseInsensitive()
                    .append(DateTimeFormatter.ofPattern("MMMM d, uuuu"))
                    .toFormatter(Locale.ENGLISH);
            double subscribers = dataScanner.nextLong();
            String content = dataScanner.next();
            String place = dataScanner.next();
            SubscriptionData newSub = new SubscriptionData(service,owner, LocalDate.parse(lauch),subscribers,content,place);
            System.out.println(newSub);
        }

    }
}

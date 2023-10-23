import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class Sub extends Streaming{
private LocalDate launch;
private String service;
private int subscribers;
private String content;
private String owner;
private String place;

    public Sub(LocalDate launch, String service, int subscribers, String content, String owner, String place) {
        super(launch, service, subscribers, content, owner, place);
        this.launch = launch;
        this.service = service;
        this.subscribers = subscribers;
        this.content = content;
        this.owner = owner;
        this.place = place;
    }

    public Sub(String service, String owner, LocalDate lauch, double subscribers, String content, String place) {
        super();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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
            Sub newSub = new Sub(service,owner, LocalDate.parse(lauch),subscribers,content,place);
            System.out.println(newSub);
        }

    }
}

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Streaming {
    private String service;
    private int Subscribers;
    private String Owner;
    private String Parent;



    public Streaming(String service, int Subscribers, String Owner, String Parent) {
this.service = service;
this.Subscribers = Subscribers;
this.Owner = Owner;
this.Parent = Parent;

    }



    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getSubscribers() {
        return Subscribers;
    }

    public void setSubscribers(int subscribers) {
        Subscribers = subscribers;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        Owner = Owner;
    }

    public String getParent() {
        return Parent;
    }

    public void setParent(String Parent) {
        Parent = Parent;
    }
    public  String toString() {
        return "The service is " + getService() + "The amount of subscribers are " + getSubscribers()+ "The owner is " + getOwner() + " The parrent comapny is " + getOwner();
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

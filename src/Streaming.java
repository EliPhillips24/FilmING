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

    public Streaming() {

    }


    public String getService() {
        return service;
    }

    public void setService(String service) {
        service = service;
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





}

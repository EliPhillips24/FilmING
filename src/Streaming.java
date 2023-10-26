import java.time.LocalDate;
import java.util.Date;

public class Streaming {
    private String service;
    private int Subscribers;
    private String Owner;

    private String Parent;

    public Streaming(String service, int subscribers, String owner) {
        this.service = service;
        Subscribers = subscribers;
        Owner = owner;


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

    public void setPlace(String Place) {
        Place = Place;
    }
    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        Owner = Owner;
    }



}

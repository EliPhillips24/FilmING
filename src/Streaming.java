import java.time.LocalDate;
import java.util.Date;

public class Streaming {

    private LocalDate Launch;
    private String service;
    private int Subscribers;
    private String Content;
    private Date release;


    public Streaming(LocalDate launch, String service, int subscribers, String content ) {
        Launch = launch;
        this.service = service;
        Subscribers = subscribers;
        Content = content;
    }
/*
    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {w
        this.release = release;
    }
*/
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

    public String getContent() {
        return Content;
    }


    public void setContent(String content) {
        Content = content;
    }


    public String toString() {
        return "Name Of Service" + getService()+ "Launched On: " + Launch +" With Currently "+ getSubscribers()+ "Subscribers" + " and streams" + getContent() ;
    }
}

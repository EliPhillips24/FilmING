import java.time.LocalDate;
import java.util.Date;

public class Streaming {
   // private LocalDate Launch;
    private String service;
    private int Subscribers;
  //  private String Content;
    private String Owner;

    private Date release;
   // private String Place;
    public Streaming(String service, int subscribers, String owner) {
      //  Launch = launch;
        this.service = service;
        Subscribers = subscribers;
      //  Content = content;
        Owner = owner;
      //  Place = place;

    }

    public Streaming() {

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

   // public String getContent() {
     //   return Content;
  //  }

  //  public void setContent(String content) {
     //   Content = content;
 //   }
    //public String getPlace() {
    //    return Place;
    //}

    public void setPlace(String Place) {
        Place = Place;
    }
    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        Owner = Owner;
    }

   // public String toString() {
   //     return "Name Of Service" + getService()+ "Launched On: " + Launch +" With Currently "+ getSubscribers()/1000000+ " Million Subscribers" + " and streams" + getContent() + getPlace()+ getOwner();
 //   }


}
//if LoctionOfSquareBracket is greatier thann zero
//int locationOfSquareBracket

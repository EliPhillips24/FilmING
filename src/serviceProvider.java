import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class serviceProvider extends Streaming {

    private String voiceTechnology;
    private String dataTechnology;

    public serviceProvider(String service, int Subscribers, String Owner, String Parent, String voiceTechnology, String dataTechnology) {
        super(service, Subscribers, Owner, Parent);
        this.voiceTechnology = voiceTechnology;
        this.dataTechnology = dataTechnology;
    }

    public String getVoiceTechnology() {
        return voiceTechnology;
    }

    public void setVoiceTechnology(String voiceTechnology) {
        this.voiceTechnology = voiceTechnology;

    }

    public String getDataTechnology() {
        return dataTechnology;
    }

    public void setDataTechnology(String dataTechnology) {
        this.dataTechnology = dataTechnology;
    }

    public static void readData() throws Exception {
        File dataFile = new File("src/serviceData");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\n");
        while (dataScanner.hasNext()) {

            //Appalachian Wireless
            //VoLTE
            //        LTE
            //138000
            //KY, WV
            //East Kentucky Network, LLC

            String service = dataScanner.next();
            String voiceTechnology = dataScanner.next();
            String dataTechnology = dataScanner.next();
            int numSubscribers = Integer.parseInt(dataScanner.next());
            String coverage = dataScanner.next();
            String owner = dataScanner.next();
            dataScanner.next();
                serviceProvider newProvider = new serviceProvider(service, numSubscribers, owner, coverage, voiceTechnology, dataTechnology);
            System.out.println(newProvider);
        }

    }

    public  String toString() {
            return "The Service Provider is " + getService() + ", has " +  getSubscribers() + " subscribers, is owned by " + getOwner() + ", its coverage includes" + getParent() +" has voice data via " + getVoiceTechnology() + " and non-voice data via " + getDataTechnology();
    }


}

